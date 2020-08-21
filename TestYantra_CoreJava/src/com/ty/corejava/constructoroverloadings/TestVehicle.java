package com.ty.corejava.constructoroverloadings;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v=new Vehicle();
		
		Vehicle v1=new Vehicle(4, "Diesel" ,40000.0);
		Vehicle v2=new Vehicle(2, 30000, "CG");
		Vehicle v3=new Vehicle("Petrol", 80000, 2);

	}

}
