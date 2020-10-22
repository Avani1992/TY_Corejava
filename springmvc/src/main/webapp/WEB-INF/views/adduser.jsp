<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-light bg-light"> <a
		class="navbar-brand" href="#">Navbar</a> </nav>

	<form class="col-6 offset-4 mt-4" action="mapuserdetail" method="post" >
		<div class="form-group">
			<label for="email">Email address</label> 
			<input type="email" class="form-control" id="email" name="email"> 
		</div>
		<div class="form-group">
			<label for="password">Password</label> 
			<input type="password" class="form-control" id="password" name="password">
		</div> 
		
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>