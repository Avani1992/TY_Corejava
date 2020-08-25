package com.ty.corejava.practice.Exception;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.ty.corejava.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class not found..");
		}
		try {
			String str=null;
			System.out.println(str.length());
		}catch(NullPointerException e) {
			System.out.println("nullpointer exception");
		}
		
		
		

	}

}
