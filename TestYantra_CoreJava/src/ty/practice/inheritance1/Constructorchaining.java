package ty.practice.inheritance1;

public class Constructorchaining {
	
		int a=10;
		String str="Java";
		boolean b=true;
	
	public Constructorchaining() {
		this(10);
		System.out.println("Default constructor");
	}
	
	public Constructorchaining(int a){
		this("Java");
		System.out.println("a= "+a);
	}
	
	public Constructorchaining(String str){
		
			this(true);
			System.out.println("Str= "+str);
	}
	
	public Constructorchaining(boolean b){
		
		
		System.out.println("B= "+this.b);
	}

	
	public static void main(String[] args) {
		
		new Constructorchaining();
	}
	
	

}
