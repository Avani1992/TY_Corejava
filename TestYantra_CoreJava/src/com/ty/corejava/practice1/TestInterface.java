package com.ty.corejava.practice1;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d=new Dog("Rocky", "Bow-Bow");
		Animal.animaltype();
		d.animalname();
		d.animalsound();
		
		System.out.println("====================");
		
		Cat c=new Cat("Mili", "Meow-Meow");
		Animal.animaltype();
		c.animalname();
		c.animalsound();

	}

}
