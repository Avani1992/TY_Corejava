package com.ty.corejava.collection.priorityqueue;

public class TestMyPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyPriorityQueue mp=new MyPriorityQueue();
		mp.add(10);
		mp.add(30);
		mp.add(32);
		mp.add(15);
		mp.add(23);
		mp.add(25);
		mp.add(12);
		
		System.out.println(mp);
		
		System.out.println("===========remove============");
		mp.remove(1);
		System.out.println(mp);
		

	}

}
