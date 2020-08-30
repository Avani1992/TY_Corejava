/*Show example of synchronized method in which two threads
are trying to update same thread.*/
package ty.practice.MultiThread;

public class TestPrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintTable p1=new PrintTable();
		//PrintTable p2=new PrintTable();
		
		Thread t1=new Thread() {
				
			public void run() {
				p1.printTable(5);
			}
		};
		
		Thread t2=new Thread() {
			
			public void run() {
				p1.printTable(3);
			}
		};

		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t2.start();
	}

}
