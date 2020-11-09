<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<title>SignUp</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.2/css/all.css">
<link rel="stylesheet" type="text/css" href="cssLogin.css">
</head>
<body>
	<div class="container">
		<div class="d-flex justify-content-center h-100">
			<div class="card" style="height: auto">
				<div class="card-header">
					<h3>Update</h3>
				</div>
				<div class="card-body">
					<form action="BookController" method="GET">
						<input type="hidden" name="command" value="UPDATE" />
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control" name="MaSach" value="${THE_STUDENT.getMaSach()}"
								placeholder="MSS">

						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="text" class="form-control" name="TenSach"value="${THE_STUDENT.getTenSach()}"
								placeholder="Name">
						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="text" class="form-control" name="LoaiSach" value="${THE_STUDENT.getLoaiSach()}"
								placeholder="type">
						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="text" class="form-control" name="TacGia"value="${THE_STUDENT.getTacGia()}"
								placeholder=" Author">
						</div>
						
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="far fa-envelope"></i></span>
							</div>
							<input type="text" class="form-control"
								name="DonGia"value="${THE_STUDENT.getDonGia()}" placeholder="Cost">
						</div>
						<div class="input-group form-group">
						<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-pencil-alt"></i></span>
							</div>
							<input type="text" class="form-control" name="SoLuong" value="${THE_STUDENT.getSoLuong()}"
								placeholder="SoLuong">
						</div>
						<div class="input-group form-group">
						<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-pencil-alt"></i></span>
							</div>
							<input type="text" class="form-control" name="NhaXuatBan" value="${THE_STUDENT.getNhaXuatBan()}"
								placeholder="NXB">
						</div>
						<div class="input-group form-group">
						<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-pencil-alt"></i></span>
							</div>
							<input type="text" class="form-control" name="QuocGia" value="${THE_STUDENT.getQuocGia()}"
								placeholder="QuocGia">
						</div>
						
						<div class="form-group">
							<input type="submit" value="Save"
								class="btn float-right login_btn">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>