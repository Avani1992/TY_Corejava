package com.ty.corejava.collection.Arraylist;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(30);
		al.add(1, 20);
		al.add(50);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		System.out.println(al.contains(40));
		System.out.println(al.get(3));
		System.out.println(al.indexOf(50));
		System.out.println(al.lastIndexOf(50));
		System.out.println(al.isEmpty());
		al.remove(3);
		al.remove(new Integer(30));
		System.out.println(al);
		System.out.println(al.size());
		
		Object[] array = al.toArray();
		for(Object a1:array) {
		
			System.out.println(a1);
		}
		
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(100);
		al2.add(200);
		al2.add(1,150);
		al2.add(250);
		
		ArrayList<Integer> al3=new ArrayList<>();
		al3.add(100);
		al3.add(200);
		al3.add(400);
		al3.set(2, 300);
		
		al2.addAll(al3);
		System.out.println(al2);
		
		al2.removeAll(al3);
		System.out.println(al2);
		
		System.out.println(al2.containsAll(al3));
		
		al2.clear();
		System.out.println(al2);
		
		
		
		
		
		
		
		
		
		
	}

}
