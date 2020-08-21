package com.ty.corejava.checkedexception.customexception;

public class TestCustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main started..");
		
		try
		{
		ATMSimulator as=new ATMSimulator();
		as.withdraw(4000);
		}
		catch (InsufficientamountException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main ended..");

	}

}
