package com.ty.corejava.uncheckedexception.customexception;

public class ATMSimulator {
	
	public void widthraw(int amount)
	{
		if(amount > 3000)
		{
			throw new InsufficientamountException();
		}
		else
		{
			System.out.println("Amount widthraw successfully..");
		}
	}

}
