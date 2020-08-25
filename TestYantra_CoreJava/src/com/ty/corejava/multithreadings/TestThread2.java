package com.ty.corejava.multithreadings;

public class TestThread2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Main method started..");
		
		Thread2 t2=new Thread2();
		Thread t=new Thread(t2);
		t.start();
		//t.join();
		
		Thread t1=new Thread(t2);
		t1.start();
		t1.sleep(3000);
		
		System.out.println("Main method ended..");

	}

}
