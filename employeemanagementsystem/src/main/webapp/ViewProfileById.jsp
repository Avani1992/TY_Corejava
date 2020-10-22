<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false"%>
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
	<%
		HttpSession session1 = request.getSession(false);

		if (session1 != null) {
	%>
	<nav class="navbar navbar-light bg-light">
	<div class="col-6">
		<h2>Welcome Employee</h2>
	</div>
	<div class="ml-auto">
		<a class="btn btn-primary " href="ViewProfileById.html" role="button">ViewProfile</a>

		<a class="btn btn-primary " href="/employeemanagementsystem/logout"
			role="button">Logout</a>
	</div>
	</nav>
	<div class="col-6 ml-10 mt-5 ">
		<form action="/employeemanagementsystem/employeeDetailRetrieve"
			method="Post">

			<label for="eid">Enter EmployeeId: </label> <input type="number"
				name="eid" id="eid">
			<button type="submit" value="Search">Search</button>
		</form>
	</div>
	<%
		} else {
	%>
	<h2>Login First...</h2>
	<%
		response.sendRedirect("WelcomePage.html");
	%>
	<%
		}
	%>
</body>
</html>