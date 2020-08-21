package com.ty.corejava.checkedexception;

public class TestD {

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
		catch(CloneNotSupportedException | ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Main ended..");
	}

}
