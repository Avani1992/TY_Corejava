package com.ty.corejava.collection.ArrayDequeue;

import java.util.Arrays;

public class MyArrayDequeue {
	
	private Integer elementdata[];
	private final Integer defaultsize=4;
	private Integer first=0;
	private Integer last=0;
	
	MyArrayDequeue()
	{
		elementdata=new Integer[defaultsize];
	}
	
	public void add(Integer ele) {
		elementdata[last++]=ele;
		
	}
	
	public void remove()
	{
		first++;
		if(first==null) {
			
			first=0;
			last=0;
		}
	}
	
	public int size()
	{
		return last-first;
	}

	@Override
	public String toString() {
		StringBuilder s1=new StringBuilder("[");
		for(int i=first; i<last;i++) {
			if(i!=last-1) {
				s1.append(elementdata[i]).append(" , ");
			}else {
				s1.append(elementdata[i]).append("]");
			}
			
		}return s1.toString();
	}
	
	

}
