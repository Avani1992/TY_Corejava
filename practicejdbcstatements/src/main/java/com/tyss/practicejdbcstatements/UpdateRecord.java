package com.tyss.practicejdbcstatements;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class UpdateRecord {

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
		String query=properties.getProperty("uquery");
		 prestmt = conn.prepareStatement(query);
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter updated name= ");
		 String value = sc.nextLine();
		 prestmt.setString(1, value);
		 System.out.println("Enter empId= ");
		 int id = sc.nextInt();
		 prestmt.setInt(2, id);
		 
		//4. Process the Resultset returned by SQL query
		int insert = prestmt.executeUpdate();
		if(insert!=0) {
			System.out.println("RecorUpdated. "+insert);
		}else
		{
			System.out.println("Record not Updated.");
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




