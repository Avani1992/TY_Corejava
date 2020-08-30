package ty.practice.MultiThread;

public class TestStaticSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticSynchronized s1=new StaticSynchronized();
		
		Thread t1=new Thread() {
			public void run() {
				s1.print();
				//s1.print1();
				//s1.print2();
				
			}
		};
		
		Thread t2=new Thread() {
			
			public void run() {
				s1.print();
				s1.print1();
				s1.print2();
			}
		};
		
		t1.start();
		t2.start();

	}

}
