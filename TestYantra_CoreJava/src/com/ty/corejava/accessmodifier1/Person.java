package com.ty.corejava.accessmodifier1;

public class Person {
	
	private String id;
	
	private Person()
	{}
	
	private void data(int id)
	{
		System.out.println("Private data= "+id);
	}

}
