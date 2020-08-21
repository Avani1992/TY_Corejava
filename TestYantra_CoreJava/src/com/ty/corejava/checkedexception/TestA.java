package com.ty.corejava.checkedexception;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main started...");
		Person p=new Person();
		try
		{
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
