package com.tyss.employeemanagementsystem.servlet.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.employeemanagementsystem.servlet.dto.Employee;
@WebServlet("/data")
public class AllEmployeeNameRetrieve extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
	

		try{
			java.sql.Connection con = Connection.getConnection();
			List<Employee> allEmployeeDetail = EmployeeDetailDao.getAllEmployeeDetail();
			String name[]=new String[allEmployeeDetail.size()];
			for(int i=0;i<allEmployeeDetail.size();i++){
				name[i]=allEmployeeDetail.get(i).getFname();
				
			}
			req.setAttribute("Employee", name);
			String data = (String)req.getAttribute("Employee");
			out.println(data);
			req.getRequestDispatcher("/demo.jsp").forward(req, resp);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
