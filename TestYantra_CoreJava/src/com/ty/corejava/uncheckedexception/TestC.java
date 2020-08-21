package com.ty.corejava.uncheckedexception;

public class TestC {

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
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide by Zero..");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound..");
		}
		System.out.println("Subtraction of two no. is= "+(20-10));
		System.out.println("Main ended..");


	}

}
