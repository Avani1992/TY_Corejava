package com.tyss.employeemanagementsystem.servlet.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginInsert")
public class LoginInsert extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		
		PrintWriter out = resp.getWriter();
		if(session!=null){
		try{
			java.sql.Connection con = Connection.getConnection();
			String query="insert into login_info (eid,username,password) values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(req.getParameter("eid")));
			pstmt.setString(2, req.getParameter("username"));
			pstmt.setString(3, req.getParameter("password"));
			int i = pstmt.executeUpdate();
			if(i==1){
				resp.sendRedirect("AdminPage.jsp");
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}else{
		out.println("<h2>Login First</h2>");
		req.getRequestDispatcher("WelcomePage.html").include(req, resp);
	}
	}
}
