package com.ty.corejava.practice1;

public class School extends Student {

	String schoolname;
	
	School(String stuname,int stuid,String schoolname)
	{
		super(stuname, stuid);
		this.schoolname=schoolname;
	}

	@Override
	void schooldetail() {
		super.studentdetail();
		System.out.println("School name= "+this.schoolname);
		
	}
}
