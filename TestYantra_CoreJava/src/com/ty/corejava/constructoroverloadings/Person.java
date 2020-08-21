package com.ty.corejava.constructoroverloadings;

public class Person {
	
	String personname;
	int personid;
	
	static String Clgname;

	Person()
	{
		
	}
	Person(String pname,int pid, String cname )
	{
		System.out.println("Person name is= "+pname);
		System.out.println("Person id is= "+pid);
		System.out.println("Person clg name is: "+cname);
	}
	
	Person(int pid, String cname,String pname )
	{
		System.out.println("Person name is= "+pname);
		System.out.println("Person id is= "+pid);
		System.out.println("Person clg name is: "+cname);
	}
	
	
	Person(String pname, String cname,int pid )
	{
		System.out.println("Person name is= "+pname);
		System.out.println("Person id is= "+pid);
		System.out.println("Person clg name is: "+cname);
	}
}
