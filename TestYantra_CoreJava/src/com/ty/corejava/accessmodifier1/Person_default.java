package com.ty.corejava.accessmodifier1;

class Person_default {
	
	String pname;

	Person_default(String pname ) {
		
		this.pname=pname;
	}
	
	
	
	void persondata( )
	{
		System.out.println("Person data= "+this.pname);
	}
}
