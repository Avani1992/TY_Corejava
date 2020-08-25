package com.ty.corejava.collection.Set;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> t1=new TreeSet<>();
		t1.add(20);
		t1.add(15);
		t1.add(45);
		t1.add(30);
		
		System.out.println(t1);
		System.out.println("================");
		
		t1.remove(20);
		System.out.println(t1);
		System.out.println(t1.first());
		
	}

}
