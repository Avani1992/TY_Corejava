package com.ty.corejava.collection.Arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class TestPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add("ABC");
		al.add(45);
		al.add(true);
		
		System.out.println(al);
		
		al.remove(true);
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		LinkedList l1=new LinkedList<>();
		l1.add(10);
		l1.add("ABC");
		l1.add(true);
		
		System.out.println(l1);
		
		PriorityQueue pq=new PriorityQueue<>();
		pq.add(10);
		pq.add(0);
		pq.add(23);
		pq.add(1);
		pq.add(25);
		pq.add(46);
		pq.add(45);
		
		System.out.println(pq);

		PriorityQueue pq1=new PriorityQueue<>();
		pq1.add("ABC");
		pq1.add("HJK");
		pq1.add("DFG");
		pq1.add("ASD");
		pq1.add("CVB");
		pq1.add("WER");
		pq1.add("POI");
		
		System.out.println(pq1);
		
		

	}

}
