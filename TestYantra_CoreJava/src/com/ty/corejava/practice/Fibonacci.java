package com.ty.corejava.practice;

public class Fibonacci {

	public static int fibo(int a) {
		
		if(a<=1) {
			return a;
		}
		return fibo(a-1)+fibo(a-2);
	}
	
	public static int fibbo(int d) {
		
		int a=0,b=1,c;
		for(int i=2;i<=d;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fibo(9));
		
		System.out.println(fibbo(9));
		
		

	}

}
