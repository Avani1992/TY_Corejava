package com.ty.corejava.multithreadings;

public class User extends Thread {
	
	BookMyShow b;
	
	
	public User(BookMyShow b) {
		super();
		this.b = b;
	}


	public void run() {
		
		try {
			b.checkSeat();
			b.releaselock();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
