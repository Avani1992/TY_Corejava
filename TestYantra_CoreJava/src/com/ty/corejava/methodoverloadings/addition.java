package com.ty.corejava.methodoverloadings;

public class addition {
	
	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public void add(double d,int a,float f)
	{
		System.out.println("Addition of three value is: "+(d+a+f));
	}
	
	public void add(String s,boolean b)
	{
		System.out.println("Concatnation is: "+(s+b));
	}

}
