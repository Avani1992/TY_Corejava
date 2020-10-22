package com.tyss.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookie extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			Cookie cookie = new Cookie("User", "Avani");
			cookie.setMaxAge(30);
			resp.addCookie(cookie);
			
			PrintWriter out = resp.getWriter();
			out.println("Cookie created.");
	}

}
