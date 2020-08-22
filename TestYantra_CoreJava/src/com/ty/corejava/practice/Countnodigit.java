package com.ty.corejava.practice;

public class Countnodigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=345;
		int count=0;
		while(a>0) {
			
			int b=a%10;
			a=a/10;
			
			count++;
		}
		System.out.println(count);

	}

}
