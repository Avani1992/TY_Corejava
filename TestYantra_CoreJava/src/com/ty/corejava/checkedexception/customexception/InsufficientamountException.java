package com.ty.corejava.checkedexception.customexception;

public class InsufficientamountException  extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg="Insufficientamount";
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}

}
