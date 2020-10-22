<%@page import="com.tyss.employeemanagementsystem.servlet.dto.Employee"%>
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
	<%@page import="java.util.ArrayList"%>
	<%@page import="java.util.Iterator"%>
	<nav class="navbar navbar-light bg-light mb-5">
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

	<%
		ArrayList<Employee> employee = (ArrayList) request.getAttribute("Employee");
	%>
	<table cellspacing="2" cellpadding="2" border="2" align="center"
		class="table table-hover" style="width: 50%">

		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>DepartmentName</th>
			<th>Designation</th>

		</tr>
		<%
			if (request.getAttribute("Employee") != null) // Null check for the object
			{
				Iterator<Employee> iterator = employee.iterator(); // Iterator interface

				while (iterator.hasNext()) // iterate through all the data until the last record
				{
					Employee emp = iterator.next(); //assign individual employee record to the employee class object
		%>
		<tr>
			<td><%=emp.getEid()%></td>
			<td><%=emp.getFname()%></td>
			<td><%=emp.getDeptname()%></td>
			<td><%=emp.getDesignation()%></td>


		</tr>
		<%
			}
			}
		%>
	</table>
</body>
</html>