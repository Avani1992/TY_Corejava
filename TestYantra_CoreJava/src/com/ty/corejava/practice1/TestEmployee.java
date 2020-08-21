package com.ty.corejava.practice1;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Employee("Diya", 101, 40000.0, "IBM");  // upcasting
		
		p.persondata();
		
		System.out.println("===================");
		
		Employee e1=(Employee) p;  // downcasting
		e1.employeedata();

	}

}
