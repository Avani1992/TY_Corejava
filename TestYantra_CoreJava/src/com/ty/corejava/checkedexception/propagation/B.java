package com.ty.corejava.checkedexception.propagation;

public class B {
	
	public static void b () throws ClassNotFoundException
	{
		Class.forName("com.ty.corejava.checkedexception.propagation.Person");
	}

}
