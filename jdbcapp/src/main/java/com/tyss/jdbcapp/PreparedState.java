package com.tyss.jdbcapp;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class PreparedState {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Connection  conn=null;
		PreparedStatement ptst=null;
		ResultSet rs=null;
		//1. Load the Driver
		try {
			FileInputStream inputstream=new FileInputStream("db.properties");
			Properties pro = new Properties();
			pro.load(inputstream);
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(pro.getProperty("driver")).newInstance();
			
			
			//2. Get the db connection via Driver
			//String DBURL="JDBC:mysql://localhost:3306/tybench_2db?";
			// conn = DriverManager.getConnection(DBURL);
			//conn=DriverManager.getConnection(DBURL, "root", "avani");
			
			conn=DriverManager.getConnection(pro.getProperty("DBURL"), pro);
			
			//3. Issue sql query via connection
			String query="select * from person_info where id=?";
			 ptst = conn.prepareStatement(query);
			 ptst.setInt(1, Integer.parseInt(args[0]));
			  rs = ptst.executeQuery();
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
				if(ptst!=null) {
					ptst.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}// end of

	}// End of Method


}//End of Program
