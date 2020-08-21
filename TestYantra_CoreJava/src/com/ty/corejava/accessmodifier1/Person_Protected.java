package com.ty.corejava.accessmodifier1;

public class Person_Protected {
	
	protected String pname;
	
	protected Person_Protected( String pname) {
		
		this.pname=pname;
	}
	
	protected void personinfo()
	{
		System.out.println("Person info= "+this.pname);
	}

}
