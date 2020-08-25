package com.ty.corejava.collection.Set;

import java.util.TreeSet;

public class TestPersonTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Person> t1=new TreeSet<>(new SortByPname());
		t1.add(new Person(101,"Abhi"));
		t1.add(new Person(301,"Vibha"));
		t1.add(new Person(201,"Rishi"));
		t1.add(new Person(501,"Ami"));
		t1.add(new Person(401,"Siya"));
		
		System.out.println(t1);
		t1.remove(new Person(301,"Vibha"));
		System.out.println("==========================================");
		System.out.println(t1);

	}

}
