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
	<nav class="navbar navbar-light bg-light ml-auto">

	<div>
		<a class="btn btn-primary " href="ViewProfileById.jsp" role="button">ViewProfile</a>

		<a class="btn btn-primary ml-auto"
			href="/employeemanagementsystem/logout" role="button">Logout</a>
	</div>
	</nav>
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