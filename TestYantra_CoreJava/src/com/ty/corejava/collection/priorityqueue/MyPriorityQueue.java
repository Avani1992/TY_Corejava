package com.ty.corejava.collection.priorityqueue;

import java.util.Arrays;

public class MyPriorityQueue {
	
	private int elementdata[];
	private int defaultsize=4;
	private int size;
	
	MyPriorityQueue(){
		
		elementdata=new int[defaultsize];
	}
	
	public void add(int element) {
		
		if(size==elementdata.length) {
			
			ensurecapacity();
		}
		elementdata[size]=element;
		fixHeapAbove(size);
		size++;
		
	} 
	
	public void remove(int index) {
		
		if(index < 0 || index > size) {
			
			throw new IllegalArgumentException();
		}
		elementdata[index]=elementdata[size-1];
		int replacedele=elementdata[size-1];
		elementdata[--size]=0;
		if(replacedele < elementdata[getparentindex(index)]) {
			fixHeapAbove(index);
		}else {
			fixHeapBelow(index,size);
		}
	}
	
	private void fixHeapBelow(int index,int lastindex) {
		
		int childindex;
		int leftchildindex=getChildIndex(index,true);
		int rightchildindex=getChildIndex(index, false);
		
		while(index < lastindex) {
			if(leftchildindex < lastindex) {
				if(rightchildindex > lastindex) {
					
					childindex=leftchildindex;
				}else {
					childindex=elementdata[leftchildindex] < elementdata[rightchildindex] ? leftchildindex : rightchildindex;
				}
				if(elementdata[childindex]  < elementdata[index]) {
					int temp=elementdata[index];
					elementdata[index]=elementdata[childindex];
					elementdata[childindex]=temp;
				}
				index=childindex;
				leftchildindex=getChildIndex(index, true);
				rightchildindex=getChildIndex(index, false);
			}else {
				return;
			}
		}
		
	}
	
	public int getChildIndex(int index,Boolean left) {
		
		return 2*index + (left? 1:2);
	}

	private void fixHeapAbove(int index ) {
		int newdata=elementdata[index];
		int parentindex=getparentindex(index);
		int currentindex=index;
		while(currentindex > 0 && newdata < elementdata[parentindex]) {
			
			elementdata[currentindex]=elementdata[parentindex];
			currentindex=parentindex;
			parentindex=getparentindex(currentindex);
		}
		elementdata[currentindex]=newdata;
	}
	
	public int getparentindex(int index) {
		
		return (index-1)/2;
	}
	
	public void ensurecapacity() {
		
		elementdata=Arrays.copyOf(elementdata, elementdata.length * 2);
	}

	@Override
	public String toString() {
		return "MyPriorityQueue [elementdata=" + Arrays.toString(elementdata) + "]";
	}
	
	

}
