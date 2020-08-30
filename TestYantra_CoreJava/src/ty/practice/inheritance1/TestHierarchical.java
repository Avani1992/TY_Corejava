package ty.practice.inheritance1;

public class TestHierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1=new Customer(101, "Triangle", 100, "Raj");
		c1.patentinfo();
		c1.customerinfo();
		System.out.println("==========================================");
		Customer1 c2=new Customer1(102, "Square", 400, "Kriya");
		c2.patentinfo();
		c2.customer1info();

	}

}
