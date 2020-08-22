package com.ty.corejava.practice;

public class Student {
	
	String sname;
	int sid;
	
	Student(String sname,int sid)
	{
		this.sname=sname;
		this.sid=sid;
	}

	@Override
	public String toString() {
		return "sname=" + sname + ", sid=" + sid;
	}
	
	

}
