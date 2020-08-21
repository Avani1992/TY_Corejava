package com.ty.corejava.practice1;

public class TestHas_a_relationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike bike=new Bike("Aviator", 70000.0);
		
		Vehicle v=new Vehicle();
		v.b=bike;
		v.b.bikeinfo();
		
		System.out.println("==============");
		
		Car c1=new Car("Wagonr", 2019);
		v.c=c1;
		v.c.carinfo();

		System.out.println("================");
		Person p1=new Person("Riya", 201, 45000.0);
		
		v.c.person=p1;
		v.c.person.persondata();
	}

}
