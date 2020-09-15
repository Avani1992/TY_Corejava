package com.tyss.jdbcapp;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public  class MyFirstJdbcProgram {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Connection  conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		//1. Load the Driver
		try {
			FileInputStream inputstream=new FileInputStream("db.properties");
			Properties pro = new Properties();
			pro.load(inputstream);
		//	Driver driver = new Driver();
		//	DriverManager.registerDriver(driver);
			Class.forName(pro.getProperty("driver")).newInstance();
			
			
			//2. Get the db connection via Driver
			//String DBURL="JDBC:mysql://localhost:3306/tybench_2db?";
			// conn = DriverManager.getConnection(DBURL);
			//conn=DriverManager.getConnection(DBURL, "root", "avani");
			
			conn=DriverManager.getConnection(pro.getProperty("DBURL"), pro);
			
			//3. Issue sql query via connection
			 String query="select * from person_info";
			 stmt = conn.createStatement();
			 rs = stmt.executeQuery(query);
			  
			 //4. process the result returned by sql queries
			 
			 while(rs.next()) {
				 int pid=rs.getInt("id");
				 String name = rs.getString("name");
				 String emailId = rs.getString("email");
				 
				 System.out.println("Id= "+pid);
				 System.out.println("Name= "+name);
				 System.out.println("EmailId= "+emailId);
				 System.out.println("=========================");
			 }
			
			
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//5. close the connection
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

	}

}
