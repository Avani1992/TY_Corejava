package ty.practice.MultiThread;

public class PrintTable {
	
	public synchronized void printTable(int n) {
		for(int i=1;i<n;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Ans= "+(i*n));
		}
	}

}
