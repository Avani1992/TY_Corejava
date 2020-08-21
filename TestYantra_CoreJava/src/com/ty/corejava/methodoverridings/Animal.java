package com.ty.corejava.methodoverridings;

public class Animal {

	public void animaltype()
	{
		System.out.println("Pet animal");
	}
	
	public void sound(String s)
	{
		System.out.println("Sound is: "+s);
	}
	
	public int leg(int l)
	{
		return l;
	}
	
}
