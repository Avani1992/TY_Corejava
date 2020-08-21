package com.ty.corejava.unchackedexception.propagation;

public class TestPrapogation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main method called..");
		
		try
		{
			A.a();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of Bound..");
		}
		
		System.out.println("Main method ended..");

	}

}
