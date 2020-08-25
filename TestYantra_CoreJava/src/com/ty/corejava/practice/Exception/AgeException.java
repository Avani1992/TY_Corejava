package com.ty.corejava.practice.Exception;

public class AgeException extends Exception {
	
	String msg="Age Must be greater than 18";
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.msg;
	}

}
