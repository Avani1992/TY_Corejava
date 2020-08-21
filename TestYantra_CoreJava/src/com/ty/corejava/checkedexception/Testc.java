package com.ty.corejava.checkedexception;

public class Testc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main started...");
		
		try
		{
			
			Class.forName("com.ty.corejava.checkedexception.Peson");
			
			
			Person p=new Person();
			p.clone();
			System.out.println("Class cloned...");
			
		}
		catch(CloneNotSupportedException e) 
		{
			System.out.println("Can't clone object...");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("can't found class..");
		}
		System.out.println("Main ended...");



	}

}
