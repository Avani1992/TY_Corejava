package com.tyss.employeemanagementsystem.servlet.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.employeemanagementsystem.servlet.dto.Employee;

@WebServlet("/employeeDetailShow")
public class EmployeeDetailShow extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		PrintWriter out = resp.getWriter();
		int eid = Integer.parseInt(req.getParameter("eid"));
		if(session!=null){
		try{
			java.sql.Connection con = Connection.getConnection();
			Employee employeeDetail = EmployeeDetailDao.getEmployeeDetail(eid);
			Employee employee=new Employee(employeeDetail.getEid(), employeeDetail.getFname(), employeeDetail.getDoj(), employeeDetail.getDob(), employeeDetail.getAge(), employeeDetail.getDeptname(), employeeDetail.getGrade(), employeeDetail.getDesignation(), employeeDetail.getGender(), employeeDetail.getMatirialstatus(), employeeDetail.getAddress(), employeeDetail.getPhoneno());
			req.setAttribute("Employee", employee);
			req.getRequestDispatcher("/EditEmployeeDetail.jsp").forward(req, resp);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}else{
		out.println("Login First..");
		req.getRequestDispatcher("WelcomePage.html").forward(req, resp);
	}
	}
}
