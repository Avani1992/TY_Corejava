package com.ty.corejava.inheritances;

public class TestBike {

	public static void main(String[] args) {
		
		Engine engine=new Engine();
		
		Bike b=new Bike();
		
		b.e=engine;
		
		b.e.enginetype();
	}
}
