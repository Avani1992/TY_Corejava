package com.tyss.employeemanagementsystem.servlet.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.employeemanagementsystem.servlet.dto.Login;

@WebServlet("/employeeLoginPage")
public class EmployeeLoginPage extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		int id = Integer.parseInt(req.getParameter("id"));
		String uname = req.getParameter("username");
		String pwd = req.getParameter("password");
		Login detail = LoginDetailDao.employeeDetail(id);
		String username = detail.getUsername();
		String password = detail.getPassword();
		System.out.println(username+" "+password);
		System.out.println(uname+" "+pwd);
		if(uname.equals(username) && pwd.equals(password)){
			
			HttpSession session=req.getSession(true);
			session.setAttribute("username", uname);
			resp.sendRedirect("employeePage");
		}else{
			out.println("<h2>Enter correct Detail..</h2>");
			req.getRequestDispatcher("WelcomePage.html").include(req, resp);
		}
		
	}
}
