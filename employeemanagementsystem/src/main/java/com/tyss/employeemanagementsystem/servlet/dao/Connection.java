package com.tyss.employeemanagementsystem.servlet.dao;

import java.sql.DriverManager;
public class Connection {

	public static java.sql.Connection getConnection(){
		java.sql.Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/employmanagementsystem?";
			con = DriverManager.getConnection(dburl, "root","avani");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return con;
	}
}
