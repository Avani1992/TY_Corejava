package com.tyss.employeemanagementsystem.servlet.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tyss.employeemanagementsystem.servlet.dto.Employee;
import com.tyss.employeemanagementsystem.servlet.dto.Login;

public class EmployeeDetailDao {

	public static Employee getEmployeeDetail(int id){
		try{
			java.sql.Connection con = Connection.getConnection();
			String query="select * from employee_info where eid=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			Employee employee=new Employee();
			if(rs.next()){
				employee.setEid(rs.getInt("eid"));
				employee.setFname(rs.getString("fname"));
				employee.setAge(rs.getInt("age"));
				employee.setDoj(rs.getDate("doj"));
				employee.setDob(rs.getDate("dob"));
				employee.setDeptname(rs.getString("deptname"));
				employee.setDesignation(rs.getString("designation"));
				employee.setGrade(rs.getString("grade"));
				employee.setAddress(rs.getString("address"));
				employee.setMatirialstatus(rs.getString("matirialstatus"));
				employee.setGender(rs.getString("gender"));
				employee.setPhoneno(rs.getString("phoneno"));
			}
			return employee;



		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}

	}
	
	public static List<Employee> getAllEmployeeDetail(){
		try{
			java.sql.Connection con = Connection.getConnection();
			String query="select eid,fname,deptname,designation  from employee_info";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			ArrayList<Employee> al=new ArrayList<>();
			
			while(rs.next()){
				Employee employee=new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setFname(rs.getString("fname"));
				employee.setDeptname(rs.getString("deptname"));
				employee.setDesignation(rs.getString("designation"));
				al.add(employee);
			}
			return al;



		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}

	}
}
