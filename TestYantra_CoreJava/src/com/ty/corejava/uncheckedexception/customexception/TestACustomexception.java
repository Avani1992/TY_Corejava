package com.ty.corejava.uncheckedexception.customexception;

public class TestACustomexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main started..");
		
		try
		{
			ATMSimulator as=new ATMSimulator();
			as.widthraw(2000);
		}
		catch(InsufficientamountException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main ended..");

	}

}
