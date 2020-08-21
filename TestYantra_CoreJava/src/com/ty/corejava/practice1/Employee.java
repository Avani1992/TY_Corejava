package com.ty.corejava.practice1;

public class Employee extends Person {
	
	static String companyname;
	
	Employee(String pname,int pid,double salary,String companyname)
	{
		super(pname, pid, salary);
		Employee.companyname=companyname;
	}
	
	public void employeedata()
	{
		super.persondata();
		System.out.println("Company name= "+Employee.companyname);
	}

}
