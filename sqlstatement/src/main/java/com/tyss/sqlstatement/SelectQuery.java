package com.tyss.sqlstatement;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class SelectQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			FileInputStream inputstream=new FileInputStream("db.properties");
			Properties pro = new Properties();
			pro.load(inputstream);
			
			//1. Load the driver
			Class.forName(pro.getProperty("driver"));
			
			//2. Create a DBConnection via Driver
			 conn = DriverManager.getConnection(pro.getProperty("dburl"),pro);
			 
			//3.Issue sql query via Connection
			 
			 String query=pro.getProperty("squery");
			 stmt = conn.createStatement();
			 rs = stmt.executeQuery(query);
			 
			//4. Process the result return by SQL query
			 
			 while(rs.next()) {
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
				 System.out.println("--------------------------------------------");
			 }
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			
			//5. Close DB objects
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
		}//End Finally block

	}// End of Method

}// End of Program
