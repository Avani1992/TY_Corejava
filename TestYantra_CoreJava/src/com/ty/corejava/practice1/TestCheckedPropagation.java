package com.ty.corejava.practice1;

public class TestCheckedPropagation {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		TestB tb=new TestB();
		try
		{
			tb.b();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Exception: "+e.getMessage());
		}

	}

}
