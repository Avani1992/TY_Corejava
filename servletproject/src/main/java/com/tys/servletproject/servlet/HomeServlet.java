package com.tys.servletproject.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		if(session!=null){
		String username = (String)session.getAttribute("User");
		
		resp.setContentType("text/html");
		out.println("<h1>Welcome "+username+"<br>");
		
		out.println("<br>");
		req.getRequestDispatcher("SearchPerson.html").include(req, resp);
		}else{
			out.println("<h2>Login First.</h2>");
			req.getRequestDispatcher("LoginForm.html").include(req, resp);
		}
	}

}
