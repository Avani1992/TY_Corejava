package com.tyss.sqlpreparedstatement;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class SelectQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement prestmt=null;
		ResultSet rs=null;
		try {
			//1. load the driver
			FileInputStream inputstream=new FileInputStream("preparedst.properties");
			Properties pro = new Properties();
			pro.load(inputstream);
			Class.forName(pro.getProperty("driver"));
			
			//2. Create DB connection via Driver
			
			 conn = DriverManager.getConnection(pro.getProperty("dburl"), pro);
			//3. Issue SQL query via Connection
			 
			 String query=pro.getProperty("squery");
			 prestmt = conn.prepareStatement(query);
			 prestmt.setInt(1, Integer.parseInt(args[0]));
			 rs = prestmt.executeQuery();
			 
			 //4. Process the result return by SQL query
			 
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
			System.out.println(e.getMessage());
		}finally {
			
			//5. Close DB objects
			try {
				if(conn!=null) {
					conn.close();
				}
				if(prestmt!=null) {
					prestmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}//End Fi

	}// End of Method

}// End of Program
