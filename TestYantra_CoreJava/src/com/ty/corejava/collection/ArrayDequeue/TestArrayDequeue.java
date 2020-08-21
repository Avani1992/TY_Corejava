package com.ty.corejava.collection.ArrayDequeue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer>ad =new ArrayDeque<>();
		
		ad.add(10);
		ad.add(20);
		ad.addFirst(0);
		ad.add(30);
		ad.add(40);
		ad.addLast(50);
		
		System.out.println(ad);
		
		Iterator<Integer> itr = ad.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		
		ad.addAll(al);
		
		System.out.println(ad);
		
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		
		

	}

}
