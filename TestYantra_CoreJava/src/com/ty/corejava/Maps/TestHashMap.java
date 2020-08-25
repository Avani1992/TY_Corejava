package com.ty.corejava.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("Abhi", 12);
		hm.put("Siya", 34);
		hm.put("Bina", 34);
		hm.put(null, 56);
		hm.put(null,89);
		
		System.out.println(hm);
		
		Set<Entry<String, Integer>> entrySet = hm.entrySet();
		for(Entry<String, Integer> e1:entrySet) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("=========================");
		}
		
		System.out.println("===========Keys===============");
		Set<String> keySet = hm.keySet();
		for(String k1:keySet) {
			System.out.println(k1);
			System.out.println("========================");
		}
		
		System.out.println("=========Values============");
		Collection<Integer> values = hm.values();
		
		for(Integer v1:values) {
			System.out.println(v1);
			System.out.println("========================");
		}
		
		System.out.println(hm.containsKey("Siya"));
		hm.remove(null);
		System.out.println(hm);
		
	}

}
