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
	<nav class="navbar navbar-light bg-light">
	<div class="col-6">
		<h2>Welcome Employee</h2>
	</div>
	<div class="ml-auto">
		<a class="btn btn-primary " href="ViewProfileById.jsp" role="button">ViewProfile</a>

		<a class="btn btn-primary " href="/employeemanagementsystem/logout"
			role="button">Logout</a>
	</div>
	</nav>
	<%
		Employee employee = (Employee) request.getAttribute("Employee");
	%>
	<table cellspacing="2" cellpadding="2" border="2" align="center"
		class="table table-hover mt-5" style="width: 50%">

		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>DepartmentName</th>
			<th>Designation</th>
			<th>Gender</th>
		</tr>
		<tr>
			<td><%=employee.getEid()%></td>
			<td><%=employee.getFname()%></td>
			<td><%=employee.getDeptname()%></td>
			<td><%=employee.getDesignation()%></td>
			<td><%=employee.getGender()%></td>


		</tr>
		</table>
	<%-- <form>
		<div class="form-row mt-5">
			<div class="form-group col-md-4 ml-5">
				<label for="eid">EmployeeId</label> <input type="number"
					class="form-control" id="eid" name="eid"
					placeholder=<%=employee.getEid()%>>
			</div>
			<div class="form-group col-md-4">
				<label for="ename">EmployeeName</label> <input type="text"
					class="form-control" id="ename" name="ename"
					placeholder=<%=employee.getFname()%>>
			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-3 ml-5">
				<label for="doj">DateofJoining</label> <input type="text"
					class="form-control" id="doj" name="doj"
					placeholder=<%=employee.getDoj()%>>
			</div>
			<div class="form-group col-md-3">
				<label for="dob">DateofBirth</label> <input type="text"
					class="form-control" id="dob" name="dob"
					placeholder=<%=employee.getDob()%>>
			</div>
			<div class="form-group col-md-2">
				<label for="age">Age</label> <input type="number"
					class="form-control" id="age" name="age"
					placeholder=<%=employee.getAge()%>>
			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-3 ml-5">
				<label for="dname">DepartmentName</label> <input type="text"
					class="form-control" id="dname" name="dname"
					placeholder=<%=employee.getDeptname()%>>
			</div>
			<div class="form-group col-md-3">
				<label for="designation">Designation</label> <input type="text"
					class="form-control" id="designation" name="designation"
					placeholder=<%=employee.getDesignation()%>>
			</div>
			<div class="form-group col-md-2">
				<label for="phoneno">Phoneno</label> <input type="text"
					class="form-control" id="phoneno" name="phoneno"
					placeholder=<%=employee.getPhoneno()%>>
			</div>
		</div>
		<div class="form-group ml-5">
			<label for="address">Address</label>
			<textarea class="form-control" id="address" name="address"
				style="width: 69%" placeholder=<%=employee.getAddress()%>></textarea>
		</div>

		<div class="form-row">
			<div class="form-group col-md-3 ml-5">

				<label for="grade">Grade</label> <input type="text"
					class="form-control" placeholder=<%=employee.getGrade()%>>
			</div>
			<div class="form-group col-md-3">
				<label for="matirialStatus">MatirialStatus</label> <input
					type="text" class="form-control"
					placeholder=<%=employee.getMatirialstatus()%>>
			</div>
			<div class="form-group col-md-3 mt-2 ml-2">
				<label for="gender">Gender:</label> <input type="text"
					class="form-control" placeholder=<%=employee.getGender()%>>
			</div>
		</div>

	</form>
 --%></body>
</html>