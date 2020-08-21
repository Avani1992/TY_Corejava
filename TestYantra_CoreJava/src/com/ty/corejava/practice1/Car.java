package com.ty.corejava.practice1;

public class Car {
	
	String carname;
	int carmodel;
	
	Person person;
	
	Car(){}
	
	public Car(String carname, int carmodel) {
		super();
		this.carname = carname;
		this.carmodel = carmodel;
	}



	public void carinfo()
	{
		System.out.println("Car name= "+this.carname);
		System.out.println("Car model= "+this.carmodel);
	}

}
