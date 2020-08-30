package ty.practice.MultiThread;

public class StaticSynchronized {
	
	public static synchronized void print() {
		System.out.println(Thread.currentThread().getName()+ "  Static Synchronized method..");
	}
	
	public static void print1() {
		System.out.println(Thread.currentThread().getName()+" Static method..");
	}
	public void print2() {
		System.out.println(Thread.currentThread().getName()+ " Instance method..");
	}

}
