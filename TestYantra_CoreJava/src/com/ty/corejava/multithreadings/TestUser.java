package com.ty.corejava.multithreadings;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main started..");
		
		BookMyShow b1=new BookMyShow();
		User u1=new User(b1);
		User u2=new User(b1);

		u1.start();
	
		u2.start();
		
		
		System.out.println("Main ended..");
	}

}
