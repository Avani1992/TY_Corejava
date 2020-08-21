package com.ty.corejava.checkedexception.propagation;



public class A {
	
	public static void a() throws ClassNotFoundException
	{
		System.out.println("a() method called..");
		B.b();
	}

}
