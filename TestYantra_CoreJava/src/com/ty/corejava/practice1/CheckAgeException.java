package com.ty.corejava.practice1;

public class CheckAgeException extends RuntimeException{
	
	String msg="Age mustbe greater than 20 ";
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.msg;
	}

}
