package com.ty.corejava.methodoverloadings;

public class Testsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		square s1=new square();
		
		s1.shape("Red", 4, 1000);
		
		s1.shape(100, "Yellow", 6);
		
		s1.shape(6, 150, "Blue");

	}

}
