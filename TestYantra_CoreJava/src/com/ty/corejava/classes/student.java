package com.ty.corejava.classes;

public class student  {
	
	int stuid;
	String stuname;
	
	static String schoolname;
	
	public void getStudentdata()
	{
		System.out.println("Student data= "+stuid+" "+stuname);
	}
	

	public static void schooldata()
	{
		System.out.println("SchoolData= "+schoolname);
	}
	
	
}
