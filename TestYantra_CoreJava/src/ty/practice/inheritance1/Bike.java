package ty.practice.inheritance1;

public class Bike {

	double price;
	
	
	Bike(double price){
		this.price=price;
	}
	
	public void bikeinfo() {
		System.out.println("Bike price= "+this.price);
	}
}
