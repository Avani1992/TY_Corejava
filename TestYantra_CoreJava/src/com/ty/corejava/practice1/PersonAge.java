package com.ty.corejava.practice1;

public class PersonAge {
	
	public void personAge(int age)
	{
		if(age < 20)
		{
			throw new CheckAgeException();
		}
		else
		{
			System.out.println("Age is morethan 20.");
		}
	}

}
