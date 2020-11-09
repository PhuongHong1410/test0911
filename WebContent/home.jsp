<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta http-equiv="Content-Type" content="text/html;  charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand -->
  <a class="navbar-brand" href="#"><i class="fas fa-home"></i></a>

  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="#">ReActive</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"  onclick="window.location.href='add-book.jsp';return false">ADD NEW BOOK</a>
    </li>

    <!-- Dropdown -->
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        Dropdown link
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="#">Link 1</a>
        <a class="dropdown-item" href="#">Link 2</a>
        <a class="dropdown-item" href="#">Link 3</a>
      </div>
    </li>
  </ul>
</nav>
<br>
  
<div class="container">
  <h2>Quan Ly Sach</h2>        
 
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>MaSach</th>
        <th>TenSach</th>
        <th>LoaiSach</th>
        <th>TacGia</th>
        <th>DonGia</th>
        <th>SoLuong</th>
        <th>NhaXuatBan</th>
         <th>QuocGia</th>
           <th>Action</th>
    
          <th>Delete</th>
         
        
      </tr>
    </thead>
    <tbody>
 	<c:forEach var="list" items="${STUDENT_LIST}">
 	<c:url var="tempLink" value="BookController">
	 			<c:param name = "command" value="LOAD" />
	 			<c:param name = "MaSach" value = "${list.getMaSach()}"/>
	 		</c:url>
	 		<c:url var="tempLink1" value="BookController">
	 			<c:param name = "command" value="DELETE" />
	 			<c:param name = "studentCodeDelete" value = "${list.getMaSach()}"/>
	 		</c:url>
 		<tr>
				<td>${list.getMaSach()}</td>
				<td>${list.getTenSach()}</td>
				<td>${list.getLoaiSach()}</td>
				<td>${list.getTacGia()}</td>
				<td>${list.getDonGia()}</td>
				<td>${list.getSoLuong()}</td>
				<td>${list.getNhaXuatBan()}</td>
				<td>${list.getQuocGia()}</td>
               	<td><a href="${tempLink}">Update</a></td>
				<td><a href="${tempLink1}">Delete</a></td>
				
		</tr>
	 </c:forEach>
	</tbody>
  </table>
</div>

</body>
</html>
