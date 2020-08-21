package com.ty.corejava.inheritances;

public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company c1=new Company();
		
		Person p1=new Person("Diya", 101);
		Employee e1=new Employee("IBM", 200000.0);
		
		c1.p=p1;
		c1.p.personinfo();
		
		c1.e=e1;
		c1.e.employeeinfo();

	}

}
