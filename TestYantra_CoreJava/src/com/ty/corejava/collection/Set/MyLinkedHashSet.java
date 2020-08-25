package com.ty.corejava.collection.Set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyLinkedHashSet {
	
	
	private LinkedList<String> elementdata[];
	private final int default_size=10;
	
	
	public MyLinkedHashSet() {
		super();
		elementdata=new LinkedList[default_size];
	}
	
	public void add(String element) {
		
		int index=hashcodeFunction(element);
		if(elementdata[index]==null) {
			
			elementdata[index]=new LinkedList<String>();
			elementdata[index].add(element);
		}else {
			elementdata[index].add(element);
		}
	}
	
	public void remove(String element) {
		
		int index=hashcodeFunction(element);
		if(elementdata[index]!=null && elementdata[index].contains(element)) {
			elementdata[index].remove();
		}else {
			System.out.println("Element doesn't exist..");
		}
	}
	
	private int hashcodeFunction(String element) {
		
		char[] charArray = element.toCharArray();
		int sum=0;
		for(int i=0;i<charArray.length;i++) {
			sum=sum+charArray[i];
		}
		return sum % default_size;
	}

	@Override
	public String toString() {
		return "MyLinkedHashSet [elementdata=" + Arrays.toString(elementdata) + "]";
	}
	
	
	
	

}
