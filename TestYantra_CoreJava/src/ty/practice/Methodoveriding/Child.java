package ty.practice.Methodoveriding;

public class Child extends Parent{

	double cmoney;
	String cname;
	
	public Child(double money, String name,double cmoney,String cname) {
		super(money, name);
		this.cmoney=cmoney;
		this.cname=cname;
		
	}
	 public void info() {
		 super.info();
		 System.out.println("Child money= "+(super.money+this.cmoney));
		 System.out.println("Child name= "+this.cname);
	 }
	
	

}
