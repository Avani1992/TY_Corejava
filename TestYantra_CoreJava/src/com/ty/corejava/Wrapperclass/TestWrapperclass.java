package com.ty.corejava.Wrapperclass;

public class TestWrapperclass {
	
	public static void main(String[] args) {
		
		int a=10;
		
		Integer a1=new Integer(a);   // boxing
		
		int a2=(int)a1;  // unboxing
		
		int b=20;
		
		Integer b1=b; // autoboxing
		
		int b2=b1;  // autounboxing
	}

}
