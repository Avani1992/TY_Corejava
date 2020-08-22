package com.ty.corejava.practice;

public class TestFactorial {
	
	public static int factorial(int a){
		
		if(a==0 || a==1) {
			return 1;
		}
		return a*factorial(a-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(factorial(5));
	}

}
