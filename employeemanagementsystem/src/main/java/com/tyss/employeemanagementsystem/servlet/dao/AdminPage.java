package com.tyss.employeemanagementsystem.servlet.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/adminPage")
public class AdminPage extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		if(session!=null){
		String username = (String)session.getAttribute("username");
		session.setAttribute("user","avani" );
		resp.setContentType("text/html");
		out.println("<h3>Welcome "+username+"</h3><br>");
		req.getRequestDispatcher("AdminPage.jsp").include(req, resp);
		}else{
			out.println("Login First.");
			req.getRequestDispatcher("WelcomePage.html").include(req, resp);
		}
	}
}
