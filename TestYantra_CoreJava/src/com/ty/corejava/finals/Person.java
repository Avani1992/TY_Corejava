package com.ty.corejava.finals;

public final class Person {
	
	public final String pname;
	
	public static final int pid;
	
	Person(String pname)
	{
		this.pname=pname;
	}
	
//	{
//		pname="abhi";
//	}
	
	static
	{
		pid=101;
	}
	
	public final void persondata()
	{
		System.out.println("Person data= "+this.pname+ " "+ Person.pid);
	}

}
