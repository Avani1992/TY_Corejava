package ty.practice.MultiThread;

public class Priority extends Thread {
	
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getPriority());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Priority p1=new Priority();
		
		Thread t1=new Thread(p1);
		t1.setPriority(MAX_PRIORITY);
		Thread t2=new Thread(p1);
		t2.setPriority(MIN_PRIORITY);
		Thread t3=new Thread(p1);
		t3.setPriority(NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
