package com.ty.corejava.inheritances;

public class TestHash_a_relationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dominos d1=new Dominos();
		
		swiggy s1=new swiggy();
		
		s1.d=d1;
		
		s1.d.getpizza();

	}

}
