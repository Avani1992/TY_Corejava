package com.ty.corejava.collection.LinkedList;

public class TestMyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLinkedList<Integer> ml=new MyLinkedList<>();
		
		ml.add(10);
		ml.add(20);
		ml.add(30);
		ml.add(40);
		
		System.out.println(ml);
		
		for(int i=0;i<ml.size;i++)
		{
			System.out.println(ml.get(i));
		}
		System.out.println("=======After remove=========");
		
		ml.remove(90);
		
		
		for(int i=0;i<ml.size;i++)
		{
			System.out.println(ml.get(i));
		}
		

	}

}
