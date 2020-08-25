package com.ty.corejava.Maps;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Integer> t1=new TreeMap<>();
		t1.put("Veena", 34);
		t1.put("Anu", 12);
		t1.put("Beena", 45);
		t1.put("Riya", 34);
		
		System.out.println(t1);
		
		t1.remove("Beena");
		System.out.println("=====Remove=============");
		System.out.println(t1);
		
		Set<Entry<String, Integer>> entrySet = t1.entrySet();
		for(Entry<String, Integer> e1:entrySet) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("==================");
		}
	}

}
