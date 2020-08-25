package com.ty.corejava.Maps;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Employee, Integer> t1=new TreeMap<>(new SortByename());
		t1.put(new Employee(101,"Siya"), 12);
		t1.put(new Employee(401,"Riya"), 22);
		t1.put(new Employee(301,"Ami"), 56);
		t1.put(new Employee(201,"Bira"), 62);
		
		System.out.println(t1);
		
		System.out.println("=============");
		
		Set<Entry<Employee, Integer>> entrySet = t1.entrySet();
		for(Entry<Employee, Integer> e1:entrySet) {
			
			Employee key = e1.getKey();
			System.out.println(key.eid+" "+key.ename);
			System.out.println(e1.getValue());
			System.out.println("====================");
		}
		

	}

}
