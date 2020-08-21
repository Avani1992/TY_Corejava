package com.ty.corejava.uncheckedexception;

public class TestD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main stared..");
		System.out.println("Sum of two number= "+(10+20));
		try
		{
			int a[]=new int[5];
		    a[7]=30;
			
			System.out.println("Division of two no= "+(10/0));
			
			
		}
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exceptio= "+e.getMessage());
		}
		
		System.out.println("Subtraction of two no. is= "+(20-10));
		System.out.println("Main ended..");




	}

}
