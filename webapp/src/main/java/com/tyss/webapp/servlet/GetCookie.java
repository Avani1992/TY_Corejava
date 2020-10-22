package com.tyss.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCookie extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		Cookie[] cookies = req.getCookies();
		for(Cookie cookie:cookies){
			out.println("Cookie name= "+cookie.getName());
			out.println("Cookie value= "+cookie.getValue());
		}
	}
}
