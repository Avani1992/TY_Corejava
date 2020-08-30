package ty.practice.inheritance1;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1=new Vehicle(2019, "Bike");
		Bike b1=new Bike(80000);
		
		Person p=new Person("Rehan");
		
		p.v=v1;
		p.b=b1;
		
		p.v.vehicleinfo();
		p.b.bikeinfo();
		p.personInfo();

	}

}
