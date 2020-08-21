package com.ty.corejava.practice1;

public abstract class Student {
	
	String stuname;
	static int stuid;
	
	Student(){}
	Student(String stuname,int stuid)
	{
		this.stuname=stuname;
		Student.stuid=stuid;
	}
	
	abstract void schooldetail();
	
	public  void studentdetail()
	{
		System.out.println("Student name= "+this.stuname);
		System.out.println("Student id= "+Student.stuid);
	}
	
	public static void studentinfo()
	{
		System.out.println("Student info method..");
	}
	
	static
	{
		System.out.println("Student static initializer block..");
	}
	
	{
		System.out.println("IIB...");
	}

}
