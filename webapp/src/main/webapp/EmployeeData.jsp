<%@page import="com.tyss.webapp.servlet.bean.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Detail:</h2>
<h3>Employee Id:<%=request.getAttribute("empId")  %> </h3>

<h3>Employee Name:<%=request.getAttribute("empName")  %> </h3>
<%
		EmployeeBean empBean = (EmployeeBean) request.getAttribute("Employee");
%>
<h3>Employee object EmpName= <%=empBean.getEmpname()  %>
<h3>Employee object EmpId= <%=empBean.getEmpid()  %>

<% class Student{
	int sid;
	String sname;
	
	Student(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
	public int getSid(){
		return this.sid;
	}
	public String getSname(){
		return this.sname;
	}
}
%>
<% Student s1=new Student(111,"Pooja"); %>
<h2>Student id=<%= s1.getSid() %></h2>
<h2>Student name=<%=s1.getSname() %></h2>


</body>
</html>