package com.tyss.employeemanagementsystem.servlet.dao.test;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tyss.employeemanagementsystem.servlet.dao.Connection;
import com.tyss.employeemanagementsystem.servlet.dto.Employee;

public class EmployeeInsertTest {

	Employee emp=new Employee();
	
	@Before
	public void setUp() throws Exception {
		java.sql.Connection con=Connection.getConnection();
		try{
			for(int i=101;i<=200;i++){
			String query="insert into employee_info (eid,fname,doj,dob,age,deptname,grade,designation,gender,matirialstatus,address,phoneno) "
					+ "values(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1,i );
			pstmt.setString(2, "Rekha"+i);
			
			java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-12");
			System.out.println(date);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			pstmt.setDate(3, sqlDate);
			java.util.Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse("1993-11-11");
			System.out.println(date1);
			java.sql.Date sqlDate1 = new java.sql.Date(date1.getTime());
			pstmt.setDate(4, sqlDate1);
			pstmt.setInt(5,25);
			pstmt.setString(6, "IT");
			pstmt.setString(7, "M2");
			pstmt.setString(8, "Developer");
			pstmt.setString(9, "Female");
			pstmt.setString(10, "Single");
			pstmt.setString(11, "Pune");
			pstmt.setString(12, "9090786756");
			int j = pstmt.executeUpdate();
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		setUp();
	}

}
