package com.tyss.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@RequestMapping(path="/welcome")
	public String getWelcomePage(){
		return "index.jsp";
	}
	
	@RequestMapping(path="/home")
	@ResponseBody
	public String getHomeDetail(){
		return "home";
	}
	
	//localhost:8081/springmvc/person?id=104
	@RequestMapping(path="/person")
	@ResponseBody
	public String getParamValue(@RequestParam("id") String id){
		return "Param value= "+id;
	}
	
	//localhost:8081/springmvc/person/104
	@RequestMapping(path="/person/{pid}")
	@ResponseBody
	public String getParamData(@PathVariable("pid") String id){
		return "Param value= "+id;
	}

}
