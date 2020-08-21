package com.ty.corejava.castings;

public class Bike extends Vehicle{
	
String bikename;
	
	Bike(String type,double price,String engine,String bikename)
	{
		super(engine, price, type);
		this.bikename=bikename;
	}
	
	public void bikeinfo()
	{
		
		System.out.println("Bike name= "+this.bikename);
	}

}
