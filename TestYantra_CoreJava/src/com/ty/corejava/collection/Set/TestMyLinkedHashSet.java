package com.ty.corejava.collection.Set;

public class TestMyLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLinkedHashSet h1=new MyLinkedHashSet();
		h1.add("Diya");
		h1.add("Priya");
		h1.add("Ami");
		h1.add("Bina");
		h1.add("Cina");
		
		System.out.println(h1);
		
		System.out.println("========================");
		h1.remove("ami");
		System.out.println(h1);

	}

}
