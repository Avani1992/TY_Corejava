package com.ty.corejava.abstraction;

public abstract class Person {
	
	static String pname;
	int pid;
	
	Person(String pname,int pid)
	{
		this.pid=pid;
		Person.pname=pname;
		
	}
	
	public static void personinfo()
	{
		System.out.println("Person name= "+Person.pname);
	}
	
	public void personid()
	{
		System.out.println("Person id= "+this.pid);
	}
	
	static
	{
		System.out.println("SIB executed...");
	}
	
	{
		System.out.println("IIB executed...");
	}
	
	abstract void data();
	

}
