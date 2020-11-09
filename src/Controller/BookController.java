package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import Models.DAO;
import Models.InfoBook;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;



/**
 * Servlet implementation class BookController
 */
@WebServlet("/BookController")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DAO dao;
	@Resource(name="jdbc/QLBSach")
	private DataSource dataSource;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		dao = new DAO(dataSource);
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// read the "command" parameter
			String theCommand = request.getParameter("command");
			
			// if the command is missing, then default to listing students
			if (theCommand == null) {
				theCommand = "LIST";
			}
			
			// route to the appropriate method
			switch (theCommand) {
			
			case "LIST":
				listStudents(request, response);
				break;
			case "LOAD":
				loadStudent(request,response);
				break;
			
			case "UPDATE":
				updateStudent(request,response);
			case "DELETE":
				deleteStudent(request,response);
			case "ADD":
				addStudent(request, response);
				break;
			default:
				listStudents(request, response);
			}
				
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		// TODO Auto-generated method stub
		String TenMaSach = request.getParameter("studentCodeDelete");
		dao.DeleteStudent(TenMaSach);
		listStudents(request, response);
	}
	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws NumberFormatException, SQLException, ServletException, IOException {
		// TODO Auto-generated method stub
		dao.UpdateStudent(request.getParameter("MaSach"), request.getParameter("TenSach"),
				request.getParameter("LoaiSach"),request.getParameter("TacGia"),
			Double.parseDouble(request.getParameter("DonGia")),Integer.parseInt(request.getParameter("SoLuong")),request.getParameter("NhaXuatBan"),request.getParameter("QuocGia"));
		listStudents(request, response);
	}
	private void addStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		dao.AddStudent(request.getParameter("MaSach"), request.getParameter("TenSach"),
				request.getParameter("LoaiSach"),request.getParameter("TacGia"),
			Double.parseDouble(request.getParameter("DonGia")),Integer.parseInt(request.getParameter("SoLuong")),request.getParameter("NhaXuatBan"),request.getParameter("QuocGia"));
		 listStudents(request, response);
	}
	private void loadStudent(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		// TODO Auto-generated method stub
		String TenMaSach = request.getParameter("MaSach");
		InfoBook infoBook = DAO.getBook(TenMaSach);
		request.setAttribute("THE_STUDENT", infoBook);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update-book.jsp");
		dispatcher.forward(request, response);
	}

	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		ObservableList<InfoBook> list_Students = FXCollections.observableArrayList();
		list_Students = dao.getAllInfoStudents();
		request.setAttribute("STUDENT_LIST", list_Students);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
		dispatcher.forward(request, response);
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
