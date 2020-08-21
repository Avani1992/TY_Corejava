package com.ty.corejava.castings;

public class Child extends Parent {
	
	double cmoney;
	
	Child(String pname,double money,double cmoney)
	{
		super(pname, money);
		this.cmoney=cmoney;
	}
	
	public void childinfo()
	{
		System.out.println("Child money= "+this.cmoney);
	}

}
