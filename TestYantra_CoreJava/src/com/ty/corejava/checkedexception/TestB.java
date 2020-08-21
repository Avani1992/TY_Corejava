package com.ty.corejava.checkedexception;

public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main started...");
		
		try
		{
			try
			{
				Class.forName("com.ty.corejava.checkedexception.Peson");
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("can't found class..");
			}
			Person p=new Person();
			p.clone();
			System.out.println("Class cloned...");
			
		}
		catch(CloneNotSupportedException e) 
		{
			System.out.println("Can't clone object...");
		}
		System.out.println("Main ended...");


	}

}
