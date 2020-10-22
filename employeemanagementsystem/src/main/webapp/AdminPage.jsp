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
	
	
	 if(session1!=null){ %>
	<nav class="navbar navbar-light bg-light">
	<div>
		<h2 style="color: blue">HR Portal</h2>
	</div>
	<div>
		<a class="btn btn-primary " href="GenerateLogin.jsp" role="button">GenerateLogin</a>
		<a class="btn btn-primary " href="EmployeeDetail.jsp" role="button">AddEmployee</a>
		<a class="btn btn-primary "
			href="/employeemanagementsystem/employeeDetailRetrieve" role="button">ViewEmployee</a>
		<a class="btn btn-primary " href="EditProfileById.jsp" role="button">EditEmployee</a>
		<a class="btn btn-primary ml-auto"
			href="/employeemanagementsystem/logout" role="button">Logout</a>
	</div>
	</nav>
	<%}else{ %>
	<%response.sendRedirect("WelcomePage.html"); %>
	<%} %>

</body>
</html>