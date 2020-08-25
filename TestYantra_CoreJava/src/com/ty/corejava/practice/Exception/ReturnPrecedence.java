package com.ty.corejava.practice.Exception;

public class ReturnPrecedence {
	
	static int add() {
		
		try {
			System.out.println("Try Return");
			return 5;
		}finally {
			System.out.println("Finally Return");
			return 4;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println(add());

	}

}
