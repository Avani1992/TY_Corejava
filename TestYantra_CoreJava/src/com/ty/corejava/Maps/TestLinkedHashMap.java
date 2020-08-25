package com.ty.corejava.Maps;

import java.util.LinkedHashMap;

public class TestLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, Integer> hm=new LinkedHashMap<>();
		hm.put("Abhi", 12);
		hm.put("Siya", 34);
		hm.put("Bina", 34);
		hm.put(null, 56);
		hm.put(null,89);
		
		System.out.println(hm);
		
		

	}

}
