/*1) Reverse the doubly linked list
 * 
 * */

package com.ty.corejava.practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class TestLinkedlistReverse {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> l1=new  LinkedList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		System.out.println(l1);
		System.out.println("===========reverse============");
		LinkedList<Integer> l2=new LinkedList<>();
		ListIterator<Integer> itr = l1.listIterator(l1.size());
		while(itr.hasPrevious())
		{
			l2.add(itr.previous());
		}
		
		System.out.println(l2);
		
		System.out.println("==============================");
		
		
		
		

	}

}
