package com.tys.servletproject.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class PersonDetail extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String empid = req.getParameter("id");
		resp.setContentType("text/html");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		Person record = manager.find(Person.class, Integer.parseInt(empid));
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Employee Id= "+record.getId()+"</h1>");
		out.print("<h1>Employee name= "+record.getName()+"</h1>");
		out.print("<h1>Employee email= "+record.getEmail()+"</h1>");
		out.print("</body>");
		out.print("</html>");
		
	}


}
