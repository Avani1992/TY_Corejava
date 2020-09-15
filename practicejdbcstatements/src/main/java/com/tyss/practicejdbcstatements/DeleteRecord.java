package com.tyss.practicejdbcstatements;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		

		try (FileInputStream  inputstream=new FileInputStream("db.properties");){
			
			Properties properties = new Properties();
			properties.load(inputstream);


			//1. load the Driver
			Class.forName(properties.getProperty("driver"));
			String query=properties.getProperty("dquery");
			//2. Get the DB connection via Driver
			try(Connection conn=DriverManager.getConnection(properties.getProperty("dburl"), properties);
					PreparedStatement prestmt = conn.prepareStatement(query);){

			//3. Issue SQL query via Connection
		
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter empId= ");
			int id = sc.nextInt();
			prestmt.setInt(1, id);

			//4. Process the Resultset returned by SQL query
			int insert = prestmt.executeUpdate();
			if(insert!=0) {
				System.out.println("Record Deleted. "+insert);
			}else
			{
				System.out.println("Record not Deleted.");
			}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}

	}// End method

}//End class




