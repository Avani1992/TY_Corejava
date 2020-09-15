package com.tyss.practicejdbcstatements;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;



public class SelectRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			FileInputStream  inputstream=new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(inputstream);
			
		
		//1. load the Driver
		Class.forName(properties.getProperty("driver"));
		
		//2. Get the DB connection via Driver
		conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);
		stmt = conn.createStatement();
		//3. Issue SQL query via Connection
		 rs = stmt.executeQuery(properties.getProperty("squery"));
		//4. Process the Resultset returned by SQL query
		 if(rs.next()) {
			 int empid = rs.getInt("empid");
			 String name = rs.getString("name");
			 Date dateofBirth = rs.getDate("dateOfBirth");
			 String emailId = rs.getString("emailId");
			 int deptno = rs.getInt("deptno");
			 String designation = rs.getString("designation");
			 Date doj = rs.getDate("joiningDate");
			 int mId = rs.getInt("managerId");
			 double salary = rs.getDouble("salary");
			 int age = rs.getInt("age");
			 
			 System.out.println("EmployeeId= "+empid);
			 System.out.println("EmployeeName= "+name);
			 System.out.println("EmployeeDOB= "+dateofBirth);
			 System.out.println("EmployeeEmailId= "+emailId);
			 System.out.println("EmployeeDeptNo= "+deptno);
			 System.out.println("EmployeeDesignation= "+designation);
			 System.out.println("EmployeeDOJ= "+doj);
			 System.out.println("EmployeeManagerId= "+mId);
			 System.out.println("EmployeeSalary= "+salary);
			 System.out.println("EmployeeAge= "+age);
		 }else {
			 System.out.println("Record not found.");
		 }
		
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			//5. Close the JDBC object
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}

	}// End method

}//End class
