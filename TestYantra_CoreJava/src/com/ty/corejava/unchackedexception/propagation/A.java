package com.ty.corejava.unchackedexception.propagation;

public class A {
	
	public static void a()
	{
		System.out.println("a() method called..");
		B.b();
	}

}
