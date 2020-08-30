package ty.practice.inheritance1;

public class Customer1 extends Patent{
	
	double cprice;
	String cname;
	Customer1(int pid,String pname,double price,String name){
		
		super(pid, pname);
		this.cprice=price;
		this.cname=name;
	}
	
	public void customer1info() {
		super.patentinfo();
		System.out.println("Cprice= "+cprice);
		System.out.println("Cname= "+cname);
	}

}
