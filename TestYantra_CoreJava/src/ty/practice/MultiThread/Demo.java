package ty.practice.MultiThread;

public class Demo extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for(int i=0;i<2;i++) {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName());
		}
		Thread t1=new Thread(new Demo());
		t1.setName("Threadover");
		t1.start();
		t1.setName("DemoThread");
		t1.setPriority(10);

	}

}
