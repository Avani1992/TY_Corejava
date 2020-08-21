package com.ty.corejava.constructoroverloadings;

public class Vehicle {
	
	int wheels;
	String type;
	double price;
	
	Vehicle()
	{}
	Vehicle(int wheels,String type,double price)
	{
		System.out.println("Wheels: "+wheels);
		System.out.println("Type: "+type);
		System.out.println("Price: "+price);
	}
	
	Vehicle(String type,double price,int wheels)
	{
		System.out.println("Wheels: "+wheels);
		System.out.println("Type: "+type);
		System.out.println("Price: "+price);
	}
	
	Vehicle(int wheels,double price,String type)
	{
		System.out.println("Wheels: "+wheels);
		System.out.println("Type: "+type);
		System.out.println("Price: "+price);
	}

}
