package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import Models.InfoBook;

public class DAO {
	private static DataSource dataSource;

	public DAO(DataSource theDataSource) {
		dataSource = theDataSource;
	}

	public ObservableList<InfoBook> getAllInfoStudents() throws SQLException {
		ObservableList<InfoBook> list_Students = FXCollections.observableArrayList();
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		myConn = dataSource.getConnection();
		String sql = "select * from Book";
		myStmt = myConn.createStatement();
		myRs = myStmt.executeQuery(sql);
		while (myRs.next()) {
			InfoBook students = new InfoBook();
			students.setMaSach(myRs.getString("MaSach"));
			students.setTenSach(myRs.getString("TenSach"));
			students.setLoaiSach(myRs.getString("LoaiSach"));
			students.setTacGia(myRs.getString("TacGia"));	
			students.setDonGia(myRs.getDouble("DonGia"));
			students.setSoLuong(myRs.getInt("SoLuong"));
			students.setNhaXuatBan(myRs.getString("NhaXuatBan"));
			students.setQuocGia(myRs.getString("QuocGia"));
			
			list_Students.add(students);
		}
		myConn.close();
		myRs.close();
		myStmt.close();
		return list_Students;
	}
	public	void AddStudent(String MaSach,String TenSach,String LoaiSach,String TacGia,Double DonGia,Integer SoLuong,String NhaXuatBan,String QuocGia) throws SQLException {
		Connection myConn=null;
		PreparedStatement myStmt=null;
		myConn =dataSource.getConnection();
		String sql="Insert Into Book values(?,?,?,?,?,?,?,?)";
		myStmt=myConn.prepareStatement(sql);
		myStmt.setString(1,MaSach);
		myStmt.setString(2,TenSach);
		myStmt.setString(3,LoaiSach);
		myStmt.setString(4,TacGia);
		myStmt.setDouble(5,DonGia);
		myStmt.setInt(6,SoLuong);
		myStmt.setString(7,NhaXuatBan);
		myStmt.setString(8,QuocGia);		
		myStmt.execute();
		myConn.close();
		myStmt.close();
		
	}
	public	void UpdateStudent(String MaSach,String TenSach,String LoaiSach,String TacGia,Double DonGia,Integer SoLuong,String NhaXuatBan,String QuocGia) throws SQLException {
		Connection myConn=null;
		PreparedStatement myStmt=null;
		myConn =dataSource.getConnection();
		String sql="Update  Book set  MaSach=?,TenSach=?,LoaiSach=?,TacGia=?,"
				+ "DonGia=?,SoLuong=?,NhaXuatBan=?,QuocGia=?";
		myStmt=myConn.prepareStatement(sql);
		
		myStmt.setString(1,MaSach);
		myStmt.setString(2,TenSach);
		myStmt.setString(3,LoaiSach);
		myStmt.setString(4,TacGia);
		myStmt.setDouble(5,DonGia);
		myStmt.setInt(6, SoLuong);
		myStmt.setString(7, NhaXuatBan);
		myStmt.setString(8, QuocGia);
		myStmt.execute();
		myConn.close();
		myStmt.close();
		
	}
	
	public void DeleteStudent(String TenMaSach) throws SQLException  {
		Connection myConn=null;
		PreparedStatement myStmt=null;
		myConn =dataSource.getConnection();
		String sql="Delete From Book where MaSach=?";
		myStmt=myConn.prepareStatement(sql);
		myStmt.setString(1, TenMaSach);
		
		myStmt.execute();
		myConn.close();
		myStmt.close();
		
	}
	public static InfoBook getBook(String TenMaSach) throws SQLException {
		InfoBook infoBook = new InfoBook();
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		myConn = dataSource.getConnection();
		String sql = "select * from Book where MaSach = ?";
		myStmt = myConn.prepareStatement(sql);
		myStmt.setString(1, TenMaSach);
		myRs = myStmt.executeQuery();
		while (myRs.next()) {
			infoBook.setMaSach(myRs.getString("MaSach"));
			infoBook.setTenSach(myRs.getString("TenSach"));
			infoBook.setLoaiSach(myRs.getString("LoaiSach"));
			infoBook.setTacGia(myRs.getString("TacGia"));
			infoBook.setDonGia(myRs.getDouble("DonGia"));
			infoBook.setSoLuong(myRs.getInt("SoLuong"));
			infoBook.setNhaXuatBan(myRs.getString("NhaXuatBan"));
			infoBook.setQuocGia(myRs.getString("QuocGia"));
		myConn.close();
		myRs.close();
		myStmt.close();
		return infoBook;
	}
		return infoBook;
		


	}
}
