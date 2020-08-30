package ty.practice.inheritance1;

public class Methodoverloading {
	
	public static void add(int a,int b) {
		System.out.println("a+b= "+(a+b));
	}
	
	public static void add(int a,String s) {
		System.out.println("a+s= "+(a+s));
	}
	
	public static void add(String s,int a) {
		
		System.out.println("s+a="+(s+a));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(10, 20);
		add(10, "Java");
		add("Java", 20);
	}

}
