package ty.practice.MultiThread;

public class Thread1 extends Thread{
	
	public void run() {
		System.out.println("Thread name= "+Thread.currentThread().getName()+"Priority= "+getPriority());
	}

}
