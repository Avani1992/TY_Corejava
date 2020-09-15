package com.tyss.practicejdbcstatements;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn=null;
		PreparedStatement prestmt=null;
	
		
		try {
			FileInputStream  inputstream=new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(inputstream);
			
		
		//1. load the Driver
		Class.forName(properties.getProperty("driver"));
		
		//2. Get the DB connection via Driver
		conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);
		
		//3. Issue SQL query via Connection
		String query=properties.getProperty("iquery");
		 prestmt = conn.prepareStatement(query);
		 prestmt.setInt(1, Integer.parseInt(args[0]));
		 prestmt.setString(2, args[1]);
		 
		//4. Process the Resultset returned by SQL query
		int insert = prestmt.executeUpdate();
		if(insert!=0) {
			System.out.println("Record inserted. "+insert);
		}else
		{
			System.out.println("Record not inserted.");
		}
		
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			//5. Close the JDBC object
			try {
				if(conn!=null) {
					conn.close();
				}
				if(prestmt!=null) {
					prestmt.close();
				}
				
			}catch (Exception e) {
				// TODO: handle exception
			}
		}

	}// End method

}//End class


