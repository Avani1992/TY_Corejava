package com.tyss.employeemanagementsystem.servlet.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.tyss.employeemanagementsystem.servlet.dto.Login;

public class LoginDetailDao {

	public static Login employeeDetail(int id){
		try{
			java.sql.Connection con = Connection.getConnection();
			String query="select username,password from login_info where eid=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			Login login=new Login();
			if(rs.next()){
				login.setUsername(rs.getString("username"));
				login.setPassword(rs.getString("password"));
			}
			return login;



		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}

	}
}
