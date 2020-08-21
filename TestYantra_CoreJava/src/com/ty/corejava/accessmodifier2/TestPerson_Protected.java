package com.ty.corejava.accessmodifier2;

import com.ty.corejava.accessmodifier1.Person_Protected;

public class TestPerson_Protected extends Person_Protected{

	protected TestPerson_Protected(String pname) {
		super(pname);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestPerson_Protected tp=new TestPerson_Protected("Siya");
		tp.personinfo();

	}

}
