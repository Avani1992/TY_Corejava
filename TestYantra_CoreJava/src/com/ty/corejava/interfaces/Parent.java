package com.ty.corejava.interfaces;

public interface Parent {

	public static final int pid=101;
	
	public static void data() {
		
		System.out.println("Parent data= "+pid);
	}
	
	default void personid()
	{
		System.out.println("Default personid..");
	}
	
	abstract void parentinfo();
}
