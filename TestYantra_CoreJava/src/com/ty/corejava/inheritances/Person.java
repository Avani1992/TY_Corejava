package com.ty.corejava.inheritances;

public class Person {
	
	String pname;
	int pid;
	
	Person(String pname,int pid)
	{
		this.pname=pname;
		this.pid=pid;
	}
	
	public void personinfo()
	{
		System.out.println("Person name= "+this.pname);
		System.out.println("Person id= "+this.pid);
	}

}
