package com.ty.corejava.practice1;

public class Bike {
	
	String bikename;
	double price;
	
	Bike(){}
	
	public Bike(String bikename, double price) {
		super();
		this.bikename = bikename;
		this.price = price;
	}
	
	public void bikeinfo()
	{
		System.out.println("Bike name= "+this.bikename);
		System.out.println("Bike price= "+this.price);
	}
	

}
