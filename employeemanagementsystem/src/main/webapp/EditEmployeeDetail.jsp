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
<script type="text/javascript">
	function validate(){
		var id=document.getElementById('eid').value;
		if(id==" " || id.length<6 || id.length>=7){
			alert("enter 6 digit id");
			 document.myform.eid.focus();
			return false;
		}
		var age=document.getElementById('age').value;
		if(age<=18 || age>=58){
			alert("Age must be in between 19 or 57");
			return false;
		}
		
		return true;
	}
	function submited(){
		alert("Form saved..");
	}
	</script>
</head>
<body>
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
	<%
		Employee employee = (Employee) request.getAttribute("Employee");
	%>
	<form action="employeeUpdate" name="myform" method="post"
		onsubmit="submited()">
		<div class="form-row mt-5">
			<div class="form-group col-md-4 ml-5">
				<label for="eid">EmployeeId</label> <input type="number"
					class="form-control" id="eid" name="eid"
					value=<%=employee.getEid()%> placeholder=<%=employee.getEid()%>>
			</div>
			<div class="form-group col-md-4">
				<label for="ename">EmployeeName</label> <input type="text"
					class="form-control" id="ename" name="ename"
					value=<%=employee.getFname()%>
					placeholder=<%=employee.getFname()%>>
			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-3 ml-5">
				<label for="doj">DateofJoining</label> <input type="date"
					class="form-control" id="doj" name="doj"
					value=<%=employee.getDoj()%> placeholder=<%=employee.getDoj()%>>
			</div>
			<div class="form-group col-md-3">
				<label for="dob">DateofBirth</label> <input type="date"
					class="form-control" id="dob" name="dob"
					value=<%=employee.getDob()%> placeholder=<%=employee.getDob()%>>
			</div>
			<div class="form-group col-md-2">
				<label for="age">Age</label> <input type="number"
					class="form-control" id="age" name="age"
					value=<%=employee.getAge()%> placeholder=<%=employee.getAge()%>>
			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-3 ml-5">
				<label for="dname">DepartmentName</label> <input type="text"
					class="form-control" id="dname" name="dname"
					value=<%=employee.getDeptname()%>
					placeholder=<%=employee.getDeptname()%>>
			</div>
			<div class="form-group col-md-3">
				<label for="designation">Designation</label> <input type="text"
					class="form-control" id="designation" name="designation"
					value=<%=employee.getDesignation()%>
					placeholder=<%=employee.getDesignation()%>>
			</div>
			<div class="form-group col-md-2">
				<label for="phoneno">Phoneno</label> <input type="text"
					class="form-control" id="phoneno" name="phoneno"
					value=<%=employee.getPhoneno()%>
					placeholder=<%=employee.getPhoneno()%>>
			</div>
		</div>
		<div class="form-group ml-5">
			<label for="address">Address</label> <input type="text"
				class="form-control" id="address" name="address" style="width: 69% "
				value=<%=employee.getAddress()%> >
		</div>

		<div class="form-row">
			<div class="form-group col-md-3 ml-5">

				<label for="grade">Grade</label> <input type="text"
					class="form-control" name="grade" value=<%=employee.getGrade()%>
					placeholder=<%=employee.getGrade()%>>
			</div>
			<div class="form-group col-md-3">
				<label for="matirialStatus">MatirialStatus</label> <input
					type="text" class="form-control" name="matirialStatus"
					value=<%=employee.getMatirialstatus()%>
					placeholder=<%=employee.getMatirialstatus()%>>
			</div>
			<div class="form-group col-md-3 mt-2 ml-2">
				<label for="gender">Gender:</label> <input type="text"
					class="form-control" name="gender" value=<%=employee.getGender()%>
					placeholder=<%=employee.getGender()%>>
			</div>
		</div>
		<button type="submit" class="btn btn-primary ml-5"
			onclick="return(validate())">Save</button>
	</form>

</body>
</html>