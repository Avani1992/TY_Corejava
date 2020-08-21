package com.ty.corejava.castings;

public class Parent {
	
	String pname;
	double money;
	
	Parent(String pname,double money)
	{
		this.pname=pname;
		this.money=money;
	}
	
	

	public void parentinfo()
	{
		System.out.println("Parent name is= "+this.pname);
		System.out.println("Parent money= "+this.money);
	}
	
	

}
