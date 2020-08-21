package com.ty.corejava.singletoneclass;

public class Student {

	
	String sname;
	int sid;
	
	public static Student s1;
	
	public Student(String sname, int sid) {
		super();
		this.sname = sname;
		this.sid = sid;
	}
	
	public void studentinfo()
	{
		System.out.println("Student name= "+this.sname);
		System.out.println("Student id="+this.sid);
	}

	public static Student classobject()
	{
		if(s1==null)
		{
			s1=new Student("Siya",23);
		}
		return s1;
	}
	
	
}
