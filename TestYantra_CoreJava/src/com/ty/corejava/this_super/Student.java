package com.ty.corejava.this_super;

public class Student extends Person {

	String stuclass;

	public Student(String pname,int page,int pid,String stuclass) {
		super(pname, pid, page);
		this.stuclass = stuclass;
	}
	
	public void studentinfo()
	{
		super.personinfo();
		System.out.println("Student class= "+this.stuclass);
	}
	
}
