package com.ty.corejava.castings;

public class TestBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b=new Bike("Petrol", 60000, "4-stroke", "Pulsar");
		b.bikeinfo();
		b.vehicleinfo();
		
		System.out.println("------------------------");
		
		Vehicle v1=new Bike("Petrol", 70000, "4-stroke","Aviator" ); // upcasting
		v1.vehicleinfo();
		
		System.out.println("--------------------------");
		
		Bike b1=(Bike) v1;  // down casting
		b1.vehicleinfo();
		b1.bikeinfo();
	}

}
