package com.ty.corejava.castings;

public class TestCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p1=new Parent("Mohan", 100000);
		p1.parentinfo();
		
		System.out.println("---------------------------");
		
		Child c1=new Child("Kanu", 100000, 1000);
		c1.parentinfo();
		c1.childinfo();
		
		System.out.println("---------------------------");
		
		Parent p2=new Child("Ramesh", 200000, 2000); // upcasting
		p2.parentinfo();
		
		System.out.println("---------------------------");
		
		Child c2=(Child) p2;  // down casting
		c2.parentinfo();
		c2.childinfo();
		

	}

}
