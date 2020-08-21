package com.ty.corejava.collection.LinkedList;

public class Node<AnyType> {

	public Node<AnyType> prev;
	public AnyType data;
	public Node<AnyType> next;

	
	
	public Node(AnyType data) {
		this(null,data,null);
	}


	public Node(Node<AnyType> prev, AnyType data, Node<AnyType> next) {
		super();
		this.prev=prev;
		this.data = data;
		this.next = next;
	}


	@Override
	public String toString() {
		return "Node [ data=" + data + ", next=" + next + "]";
	}

	

	
	
	
}
