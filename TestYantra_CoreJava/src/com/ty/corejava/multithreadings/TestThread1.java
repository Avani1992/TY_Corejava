package com.ty.corejava.multithreadings;

public class TestThread1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Main thread started..");
		
		Thread1 t1=new Thread1();
		t1.start();
		
		Thread1 t2=new Thread1();
		t2.start();
		System.out.println("Main thread ended..");

	}

}
