package com.ty.corejava.abstraction;

public class Company extends Person {

	Company(String pname, int pid) {
		super(pname, pid);
		// TODO Auto-generated constructor stub
	}

	@Override
	void data() {
		// TODO Auto-generated method stub
		
		System.out.println("Person data= "+super.pid+" "+super.pname);
		
	}
	

}
