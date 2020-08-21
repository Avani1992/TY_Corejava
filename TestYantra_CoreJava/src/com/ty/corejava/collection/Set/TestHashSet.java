package com.ty.corejava.collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(45);
		hs.add(23);
		hs.add(90);
		hs.add(12);
		
		System.out.println(hs);
		
		hs.remove(45);
		
		
		System.out.println(hs);
		
		System.out.println("==============linkedHashset==============");
		
		LinkedHashSet<Integer> hs1=new LinkedHashSet<>();
		
		hs1.add(10);
		hs1.add(45);
		hs1.add(23);
		hs1.add(90);
		hs1.add(12);
		
		
		System.out.println(hs1);
		
		hs1.remove(45);
		
		System.out.println(hs1);
	}

}
