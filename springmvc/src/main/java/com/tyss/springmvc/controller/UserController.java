package com.tyss.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyss.springmvc.entities.User;

@Controller
public class UserController {
	@Autowired
	User user;

	/*@RequestMapping(path="/adduser")
	public String getUser(){
		return "/WEB-INF/views/adduser.jsp";
	}*/
	
	// Add prefix & suffix in xml
	@RequestMapping(path="/adduser1")
	public String getUser1(){
		return "adduser";
	}
	
	@RequestMapping(path="/postuser")
	@ResponseBody
	public String postUser(@RequestParam("email") String email,@RequestParam("password") String pwd){
		return "User Email= "+email+" User Password= "+pwd;
	}
	
	
	
	@RequestMapping(path="/userdetail")
	@ResponseBody
	public String userDetail(@RequestParam("email") String email,@RequestParam("password") String pwd){
		user.setEmail(email);
		user.setPassword(pwd);
		return "User Email= "+user.getEmail()+" User Password= "+user.getPassword();
	}
	
	@RequestMapping(path="/mapuserdetail")
	@ResponseBody
	public String MapuserDetail(User user){
		
		return "User Email= "+user.getEmail()+" User Password= "+user.getPassword();
	}
}
