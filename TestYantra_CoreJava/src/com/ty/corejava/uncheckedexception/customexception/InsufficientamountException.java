package com.ty.corejava.uncheckedexception.customexception;

public class InsufficientamountException extends  RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg="Insufficeintamount";
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}

}
