package com.ty.corejava.methodoverridings;

public class TestCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal c=new cat();
		
		c.animaltype();
		c.sound("Meow-Meow");
		
		System.out.println("Leg= "+c.leg(4));

	}

}
