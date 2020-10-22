package com.tyss.employeemanagementsystem.servlet.dto;

import lombok.Data;

@Data
public class Login {
	
	private int eid;
	private String username;
	private String password;
	
	public Login(){}

	public Login(int eid, String username, String password) {
		super();
		this.eid = eid;
		this.username = username;
		this.password = password;
	}
	

}
