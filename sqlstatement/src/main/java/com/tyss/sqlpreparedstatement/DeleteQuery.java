package com.tyss.sqlpreparedstatement;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class DeleteQuery {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement prestmt=null;
		
		int rs=0;
		try {
			FileInputStream inputstream=new FileInputStream("preparedst.properties");
			Properties pro = new Properties();
			pro.load(inputstream);
			
			//1. Load the driver
			Class.forName(pro.getProperty("driver"));
			
			//2. Create a DBConnection via Driver
			 conn = DriverManager.getConnection(pro.getProperty("dburl"),pro);
			 
			//3.Issue sql query via Connection
			 
			 String query=pro.getProperty("dquery");
			 prestmt = conn.prepareStatement(query);
			 prestmt.setInt(1, Integer.parseInt(args[0]));
			 rs = prestmt.executeUpdate();
			 
			//4. Process the result return by SQL query
			 if(rs!=0) {
				 System.out.println("Record Deleted "+rs);
			 }else {
				 System.out.println("Record not Deleted.");
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
				
			}catch (Exception e) {
				// TODO: handle exception
			}
		}//End Finally block

	}// End of Method
}// End of Program
