package com.ty.corejava.inheritances;

public class Employee {
	
	String cname;
	double salary;
	
	public Employee(String cname, double salary) {
		super();
		this.cname = cname;
		this.salary = salary;
	}
	
	public void employeeinfo()
	{
		System.out.println("Employee company name= "+this.cname);
		System.out.println("Employee salary= "+this.salary);
	}

}
