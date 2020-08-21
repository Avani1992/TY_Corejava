package com.ty.corejava.collection.Arraylist;


import java.util.Arrays;
import java.util.NoSuchElementException;



public class MyList<AnyType> {
	
	private AnyType elementdata[];
	private final int defaultsize=4;
	public int arraysize=0;
	public int position=0;
	
	public MyList()
	{
			elementdata=(AnyType[]) new Object[defaultsize];
	}
	
	public void add(AnyType element)
	{
		ensurecapacity();
		elementdata[arraysize++]=element;
	}
	
	public void add(int index,AnyType element) {
		
		ensurecapacity();
		elementdata[index]=element;
	}

	private void ensurecapacity()
	{
		if(arraysize==elementdata.length)
		{
			 elementdata = Arrays.copyOf(elementdata, elementdata.length *2);
		}
	}
	
	public AnyType get(int index)
	{
		return elementdata[index];
	}
	
	public int size()
	{
		return arraysize;
	}
	
	public void remove(int index)
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		int noOfElementShifted=elementdata.length-1-index;
		System.arraycopy(elementdata, index+1, elementdata, index, noOfElementShifted);
		elementdata[--arraysize]=null;
	}
	
	public boolean isEmpty() {
		
		return arraysize==0;
	}
	
	public void remove(AnyType element)
	{
	
		for(int i=0;i<elementdata.length;i++)
		{
			if(elementdata[i].equals(element))
			{
				position=i;
				break;
			}
		}
		this.remove(position);
	}
}
	
		
