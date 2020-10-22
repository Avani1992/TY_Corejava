package com.tyss.springmvc.entities;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class User {
	
	private String email;
	private String password;
	
	public User(){
		
	}

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	

}
