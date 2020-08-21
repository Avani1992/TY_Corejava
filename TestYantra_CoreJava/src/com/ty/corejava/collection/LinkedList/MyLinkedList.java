package com.ty.corejava.collection.LinkedList;

import java.util.NoSuchElementException;

public class MyLinkedList<AnyType> {
	
	public Node<AnyType> first;
	
	public int size;
	
	MyLinkedList(){
	}
	
	public void add(AnyType element)
	{
		if(isEmpty()) {
			
			first=new Node<AnyType>(element);
		}
		else {
			
			Node<AnyType> current=first;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=new Node<AnyType>(current, element, null);
		}
		size++;
		
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public int size()
	{
		return size;
	}
	
	public AnyType get(int index)
	{
		int currentindex=0;
		Node<AnyType> current=first;
		
		while(currentindex!=index) {
			
			current=current.next;
			currentindex++;
		}
		return current.data;
	}
	
	public void remove(AnyType element) {
		
		if(first.data.equals(element)) {
			
			first.next.prev=null;
			first=first.next;
		}
		else {
			
			Node<AnyType> current=first;
			while(current!=null && !current.data.equals(element)) {
				
				current=current.next;
			}
			if(current==null)
			{
				throw new NoSuchElementException();
			}
			else {
				if(current.next==null) {
					
					current.prev.next=null;
				}
				else {
					current.prev.next=current.next;
					current.next.prev=current.prev;
				}
			}
		}
		size--;
	}

	@Override
	public String toString() {
		return "MyLinkedList [first=" + first + ", size=" + size + "]";
	}
	
	

}
