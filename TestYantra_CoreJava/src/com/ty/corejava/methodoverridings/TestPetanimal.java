package com.ty.corejava.methodoverridings;

public class TestPetanimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PetAnimal p=new PetAnimal();
		
		Animal a=p.getanimal();
		a.animaltype();
		System.out.println("-------------------");
		
		child c=new child();
		
		dog d=c.getanimal();
		d.animaltype();
		

	}

}
