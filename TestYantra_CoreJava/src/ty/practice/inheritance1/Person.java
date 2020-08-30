package ty.practice.inheritance1;

public class Person {
	
	Vehicle v;
	Bike b;
	
	String pname;
	Person(String pname){
		
		this.pname=pname;
	}
	
	public void personInfo() {
		System.out.println("Person name= "+pname);
	}

}
