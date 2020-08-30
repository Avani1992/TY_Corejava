package ty.practice.inheritance1;

public class Vehicle {
	
	int model;
	String Vname;
	
	Vehicle(int model,String Vname){
		this.model=model;
		this.Vname=Vname;
	}
	
	public void vehicleinfo() {
		System.out.println("Model= "+this.model);
		System.out.println("Vehicle name= "+this.Vname);
	}

}
