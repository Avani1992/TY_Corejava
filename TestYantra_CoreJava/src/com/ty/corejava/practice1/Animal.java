package com.ty.corejava.practice1;

public interface Animal {
	
	public static final String animaltype="pet";
	
	abstract void animalname();
	abstract void animalsound();
	
	public static void animaltype()
	{
		System.out.println("Animal type= "+Animal.animaltype);
	}
	

}
