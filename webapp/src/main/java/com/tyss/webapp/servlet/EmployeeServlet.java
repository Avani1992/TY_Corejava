package com.tyss.webapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.webapp.servlet.bean.EmployeeBean;

public class EmployeeServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer empId = Integer.parseInt(req.getParameter("empid"));
		String empName = req.getParameter("empname");
		
		EmployeeBean employee=new EmployeeBean(empId, empName);
		req.setAttribute("empName", empName);
		req.setAttribute("empId", empId);
		req.setAttribute("Employee", employee);
		
		req.getRequestDispatcher("EmployeeData.jsp").forward(req, resp);
		
	}

}
