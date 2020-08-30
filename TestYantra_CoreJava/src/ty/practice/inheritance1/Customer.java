package ty.practice.inheritance1;

public class Customer extends Patent {
	
	double cprice;
	String cname;
	Customer(int pid,String pname,double price,String name){
		
		super(pid, pname);
		this.cprice=price;
		this.cname=name;
	}
	
	public void customerinfo() {
		super.patentinfo();
		System.out.println("Cprice= "+cprice);
		System.out.println("Cname= "+cname);
	}

}
