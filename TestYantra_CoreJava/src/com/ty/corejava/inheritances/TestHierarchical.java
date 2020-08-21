package com.ty.corejava.inheritances;

public class TestHierarchical {
	
	public static void main(String[] args) {
		
		child c1=new child();
		c1.parentmoney();
		c1.childmoney();
		
		System.out.println("--------------------------");
		daughter d=new daughter();
		d.parentmoney();
		d.dmoney();
		
	}
	

}
