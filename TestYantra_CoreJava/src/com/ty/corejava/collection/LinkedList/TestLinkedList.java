package com.ty.corejava.collection.LinkedList;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> l1=new LinkedList<>();
		
		l1.add(10);
		l1.add(30);
		l1.add(1,20);
		l1.add(40);
		l1.add(50);
		
		System.out.println(l1);
		
		l1.addFirst(5);
		l1.addLast(55);
		
		System.out.println(l1);
		
		l1.offer(58);
		l1.offerFirst(3);
		l1.offerLast(60);
		
		System.out.println(l1);
		
		l1.push(0);
		
		System.out.println(l1);
		
		System.out.println(l1.contains(55));
		
		System.out.println(l1.get(6));
		
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		System.out.println(l1);
		
		System.out.println(l1.pop());
		System.out.println(l1);
		
		System.out.println(l1.remove(6));
		System.out.println(l1.remove());
		System.out.println(l1.removeFirst());
		System.out.println(l1.removeLast());
		System.out.println(l1);
		
		

	}

}
