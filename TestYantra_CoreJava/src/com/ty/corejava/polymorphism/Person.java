package com.ty.corejava.polymorphism;

public class Person {
	
	public void personinfo(String pname,int id,double money)
	{
		System.out.println("Person name= "+pname);
		System.out.println("Person id= "+id);
		System.out.println("Person money= "+money);
	}
	
	public void personinfo(String pname,double money,int id)
	{
		System.out.println("Person name= "+pname);
		System.out.println("Person id= "+id);
		System.out.println("Person money= "+money);
	}
	
	

}
