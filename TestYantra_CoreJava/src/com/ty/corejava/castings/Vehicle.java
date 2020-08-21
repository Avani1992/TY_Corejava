package com.ty.corejava.castings;

public class Vehicle {
	
	double price;
	String type;
	String engine;
	
	Vehicle(String engine,double price,String type)
	{
		this.type=type;
		this.engine=engine;
		this.price=price;
	}

	public void vehicleinfo()
	{
		System.out.println("Engine= "+this.engine);
		System.out.println("Price= "+this.price);
		System.out.println("Type= "+this.type);
	}
}
