package ty.practice.MultiThread;

public class DeamonThread extends Thread{
	
	public void run() {
		for(int i=0;i<3;i++) {
			if(Thread.currentThread().isDaemon()) {
				System.out.println(Thread.currentThread().getName() +" Deamon Thread");
			}else {
				System.out.println(Thread.currentThread().getName()+" User Thread");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeamonThread d1=new DeamonThread();
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d1);
		
		t1.setDaemon(true);
		t1.start();
		
		t2.start();
		

	}

}
