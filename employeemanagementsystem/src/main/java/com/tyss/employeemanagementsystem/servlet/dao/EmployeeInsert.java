package com.tyss.employeemanagementsystem.servlet.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/employeeinsert")
public class EmployeeInsert extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		PrintWriter out = resp.getWriter();
		if(session!=null){
		try{
		resp.getWriter();
		resp.setContentType("text/html");
		java.sql.Connection con = Connection.getConnection();
		String query="insert into employee_info (eid,fname,doj,dob,age,deptname,grade,designation,gender,matirialstatus,address,phoneno) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, Integer.parseInt(req.getParameter("eid")));
		pstmt.setString(2, req.getParameter("ename"));
		
		java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("doj"));
		System.out.println(date);
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		pstmt.setDate(3, sqlDate);
		java.util.Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("dob"));
		System.out.println(date1);
		java.sql.Date sqlDate1 = new java.sql.Date(date1.getTime());
		pstmt.setDate(4, sqlDate1);
		pstmt.setInt(5, Integer.parseInt(req.getParameter("age")));
		pstmt.setString(6, req.getParameter("dname"));
		pstmt.setString(7, req.getParameter("grade"));
		pstmt.setString(8, req.getParameter("designation"));
		pstmt.setString(9, req.getParameter("gender"));
		pstmt.setString(10, req.getParameter("matirialStatus"));
		pstmt.setString(11, req.getParameter("address"));
		pstmt.setString(12, req.getParameter("phoneno"));
		int i = pstmt.executeUpdate();
		if(i==1){
			System.out.println("inserted..");
			resp.sendRedirect("EmployeeDetail.jsp");
		}
		
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}else{
		out.println("Login First");
		req.getRequestDispatcher("WelcomePage.html").forward(req, resp);
	}
	}
}
