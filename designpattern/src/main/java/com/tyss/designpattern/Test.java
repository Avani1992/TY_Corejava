package com.tyss.designpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.tyss.designpattern.dto.Person;

public class Test {

	
		
		
		public Person getPersonDetailById(int id) {
	    Connection  conn=null;
		java.sql.PreparedStatement stmt=null;
		ResultSet rs=null;
		//1. Load the Driver
		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			
			//2. Get the db connection via Driver
			String DBURL="JDBC:mysql://localhost:3306/tybench_2db?user=root&password=avani";
			conn = DriverManager.getConnection(DBURL);
			
			//3. Issue sql query via connection
			String query="select * from person_info where id=?";
			 stmt = conn.prepareStatement(query);
			 stmt.setInt(1, id);
			  rs = stmt.executeQuery();
			  Person person=new Person();
			 //4. process the result returned by sql queries
			 
			 if(rs.next()) {
				 person.setPid(rs.getInt("id"));
				 person.setName(rs.getString("name"));
				 person.setEmailId(rs.getString("email"));
				 
				return person;
			 }else {
				 return null;
			
			 }
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
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
		}//End of Finally
		}

	
}// End of class
