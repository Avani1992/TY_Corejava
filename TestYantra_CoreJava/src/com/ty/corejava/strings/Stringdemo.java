package com.ty.corejava.strings;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Divyai";
		String s2="Divya";
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3=new String("Pooja");
		String s4=new String("Pooja");
		
		System.out.println(s3);
		System.out.println(s4);
		
		s3=s3.concat("Banerji");
		System.out.println(s3);
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("v"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.lastIndexOf("i"));
		System.out.println(s1.length());
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 5));
		char a[]=s1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
