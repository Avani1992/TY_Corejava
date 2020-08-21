package com.ty.corejava.this_super;

public class Person {
	
	String pname;
	int pid;
	int page;
	
	Person()
	{}
	
	public Person(String pname, int pid, int page) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.page = page;
	}
	
	public void personid()
	{
		System.out.println("Person id= "+this.pid);
	}
	
	public void personinfo()
	{
		this.personid();
		System.out.println("Person name= "+this.pname);
		System.out.println("Person age= "+this.page);
	}
	
	

}
