package com.tyss.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		ServletContext context = req.getServletContext();
		String value = context.getInitParameter("User");
		out.println("<h2>Context Value= "+value+"</h2>");
		
		String username = req.getParameter("un");
		String password = req.getParameter("pw");
		
	
		out.println("<h2>Username= "+username+"</h2>");
		out.println("<h2>Password= "+password+"</h2>");

	}

}
