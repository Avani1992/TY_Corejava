package com.tyss.sqlstatement;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class UpdateQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stmt=null;
		int rs=0;
		try {
			FileInputStream inputstream=new FileInputStream("db.properties");
			Properties pro = new Properties();
			pro.load(inputstream);
			
			//1. Load the driver
			Class.forName(pro.getProperty("driver"));
			
			//2. Create a DBConnection via Driver
			 conn = DriverManager.getConnection(pro.getProperty("dburl"),pro);
			 
			//3.Issue sql query via Connection
			 
			 String query=pro.getProperty("uquery");
			 stmt = conn.createStatement();
			 rs = stmt.executeUpdate(query);
			 
			//4. Process the result return by SQL query
			 if(rs!=0) {
				 System.out.println("Record Updated "+rs);
			 }else {
				 System.out.println("Record not Updated.");
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
				
			}catch (Exception e) {
				// TODO: handle exception
			}
		}//End Finally block

	}// End of Method

}// End of Program
