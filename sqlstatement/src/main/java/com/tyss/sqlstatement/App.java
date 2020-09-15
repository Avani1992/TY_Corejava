package com.tyss.sqlstatement;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
       try {
		Class.forName("com.mysql.jdbc.Driver");
		String dburl="jdbc:mysql://localhost:3306/tybench_2db?user=root&password=avani";
		try(Connection con= DriverManager.getConnection(dburl);Statement st= con.createStatement();){
			String query="select * from employee_info where empId=103";
			try(ResultSet rs=st.executeQuery(query)) {
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
				}
					
			}
			
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
