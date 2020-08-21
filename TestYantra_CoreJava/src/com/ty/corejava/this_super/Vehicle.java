package com.ty.corejava.this_super;

public class Vehicle {
	
	double price;
	String type;
	String engine;
	
	
	Vehicle(String type)
	{
		
		this.type=type;
	}
	Vehicle(String engine,double price,String type)
	{
		this(type);
		this.engine=engine;
		this.price=price;
	}
	
	
	public void enginetype()
	{
		System.out.println("Engine type= "+this.engine);
	}
	
	public void vehicleinfo()
	{
		this.enginetype();
		System.out.println("Price= "+this.price);
		System.out.println("Type= "+this.type);
	}

}
