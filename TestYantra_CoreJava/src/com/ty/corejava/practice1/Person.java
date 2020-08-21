package com.ty.corejava.practice1;

public class Person {
	
	int pid;
	String pname;
	double salary;
	
	Person()
	{
		
	}
	
	Person(String pname,int pid,double salary)
	{
		this.pname=pname;
		this.pid=pid;
		this.salary=salary;
	}
	
	public void persondata()
	{
		System.out.println("Person name= "+this.pname);
		System.out.println("Person id= "+this.pid);
		System.out.println("Person salary= "+this.salary);
	}

}
