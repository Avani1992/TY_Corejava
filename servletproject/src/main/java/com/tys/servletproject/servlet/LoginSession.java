package com.tys.servletproject.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginSession extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("un");
		String password = req.getParameter("pw");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		if(username.equals("Kuman") & password.equals("1234")){
			HttpSession session = req.getSession();
			session.setAttribute("User", username);
			
			
			resp.sendRedirect("homeServlet");
			
			
		}else{
			out.println("<h2>Enter correct Username and Password..</h2>");
			req.getRequestDispatcher("LoginForm.html").include(req, resp);
			
		}
		
		
	}

}
