package ty.practice.Methodoveriding;

public class Parent {

	double money;
	String name;
	
	public Parent(double money,String name) {
		this.money=money;
		this.name=name;
	}
	
	public void info() {
		System.out.println("Parent money= "+this.money);
		System.out.println("Parent name= "+this.name);
	}
}
