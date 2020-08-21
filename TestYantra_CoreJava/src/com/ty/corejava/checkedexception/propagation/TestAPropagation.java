package com.ty.corejava.checkedexception.propagation;

public class TestAPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main started...");
		
		try
		{
			A.a();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found..");
		}
		
		System.out.println("Main ended...");

	}

}
