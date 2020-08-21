package com.ty.corejava.this_super;

public class Car extends Vehicle {

	String carname;
	
	Car(String type,double price,String engine,String carname)
	{
		super(engine, price, type);
		this.carname=carname;
	}
	
	public void carinfo()
	{
		super.vehicleinfo();
		System.out.println("Car name= "+this.carname);
	}
}
