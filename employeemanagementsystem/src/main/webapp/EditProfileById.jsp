<%@page import="com.tyss.employeemanagementsystem.servlet.dto.Employee"%>
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
	<%@page import="java.util.ArrayList"%>
	<%@page import="java.util.Iterator"%>
	<script type="text/javascript">
		
	<%String name = (String) request.getAttribute("Employee");%>
	var name=["Rekha","Riya","Mina","Akash"];
		var len = name.length;
		function show(value) {
			var str1 = document.getElementById('ename').value;
			document.getElementById('datalist').innerHTML = '';
			//setting datalist empty at the start of function 
			//if we skip this step, same name will be repeated 

			l = value.length;
			//input query length 
			for (var i = 0; i < len; i++) {
				if (((name[i].toLowerCase()).indexOf(value.toLowerCase())) > -1) {
					//comparing if input string is existing in tags[i] string 

					var node = document.createElement("option");
					var val = document.createTextNode(name[i]);
					node.appendChild(val);

					document.getElementById("datalist").appendChild(node);
					//creating and appending new elements in data list 
				}
			}

		}
	</script>

	<%
		HttpSession session1 = request.getSession(false);

		if (session1 != null) {
	%>
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
	<div class="col-6 ml-10 mt-5 ">
		<form action="/employeemanagementsystem/employeeDetailShow"
			method="Post">

			<label for="eid">Enter EmployeeId: </label> <input type="number"
				name="eid" id="eid">
			<button type="submit" value="Search">Search</button>
			<br> <label for="ename">Enter EmployeeName: </label> <input
				type="text" list="datalist" onkeyup="show(this.value)">
			<!-- On keyup calls the function everytime a key is released -->
			<datalist id="datalist"></datalist>
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