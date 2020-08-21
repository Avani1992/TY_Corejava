package com.ty.corejava.checkedexception.customexception;

public class ATMSimulator {
	
	public void withdraw(int amount) throws InsufficientamountException
	{
		if(amount > 3000)
		{
			throw new InsufficientamountException();
		}
		else
		{
			System.out.println("Amount withdraw successfully...");
		}
	}

}
