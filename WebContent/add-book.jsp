<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html;  charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
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
					<h3>Sign Up</h3>
				</div>
				<div class="card-body">
					<form action="BookController" method="GET">
						<input type="hidden" name="command" value="ADD" />
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control" name="MaSach"
								placeholder="MSS">

						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="text" class="form-control" name="TenSach"
								placeholder=" Name">
						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="text" class="form-control" name="LoaiSach"
								placeholder="type">
						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="text" class="form-control" name="TacGia"
								placeholder="Author">
						</div>
						
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="far fa-envelope"></i></span>
							</div>
							<input type="text" class="form-control"
								name="DonGia" placeholder="Cost">
						</div>
						<div class="input-group form-group">
						<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-pencil-alt"></i></span>
							</div>
							<input type="text" class="form-control" name="SoLuong"
								placeholder="SoLuong">
						</div>
						<div class="input-group form-group">
						<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-pencil-alt"></i></span>
							</div>
							<input type="text" class="form-control" name="NhaXuatBan"
								placeholder="NXB">
						</div>
						<div class="input-group form-group">
						<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-pencil-alt"></i></span>
							</div>
							<input type="text" class="form-control" name="QuocGia"
								placeholder="QuocGia">
						</div>
						
						<div class="form-group">
							<input type="submit" value="Add"
								class="btn float-right login_btn">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>