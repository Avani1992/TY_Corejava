package com.ty.corejava.methodoverridings;

public class dog extends Animal {
	
	public void sound(String s)
	{
		System.out.println("Dog sounds: "+s);
	}
	
	public int leg(int l)
	{
		return l;
	}

}
