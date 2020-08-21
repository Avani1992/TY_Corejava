package com.ty.corejava.methodoverridings;

public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d=new dog();
		d.animaltype();
		d.sound("Bow-Bow");
		
		System.out.println("Leg= "+d.leg(4));

	}

}
