package com.ty.corejava.practice1;

public class Cat implements Animal{
	
	String name;
	String sound;
	
	Cat(String name,String sound)
	{
		this.name=name;
		this.sound=sound;
	}

	@Override
	public void animalname() {
		System.out.println("Animal name= "+this.name);
		
	}

	@Override
	public void animalsound() {
		// TODO Auto-generated method stub
		System.out.println("Animal sound= "+this.sound);
		
	}


}
