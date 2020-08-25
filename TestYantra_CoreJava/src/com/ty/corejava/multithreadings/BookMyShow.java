package com.ty.corejava.multithreadings;

public class BookMyShow {

	int i=0;
	
	public synchronized void checkSeat() throws InterruptedException  {
		
		if(i==0) {
			System.out.println("Ticket confirmed..");
			i++;
			wait();
			
		}else {
			System.out.println("Choose another seat.");
		}
	}
	
	public synchronized void releaselock() {
		notify();
	}
}
