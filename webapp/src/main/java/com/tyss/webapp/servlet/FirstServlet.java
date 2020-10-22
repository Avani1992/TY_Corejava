package com.tyss.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		ServletConfig config = getServletConfig();
		String value = config.getInitParameter("First");
		
		out.println("<h1>Hello Servlet</h1>");
		out.println("Servlet name="+req.getServerName());
		out.println("Method name="+req.getMethod());
		out.println("Protocol name="+req.getProtocol());
		out.println("Config Value= "+value);
	}

}
