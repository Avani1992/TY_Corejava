package ty.practice.MultiThread;

public class ShareSameObj extends Thread {
	
	public void run() {
		for(int i=0;i<3;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}System.out.println(Thread.currentThread().getName()+"i=" +i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShareSameObj s1=new ShareSameObj();
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s1);
		
		t1.start();
		t2.start();

	}

}
