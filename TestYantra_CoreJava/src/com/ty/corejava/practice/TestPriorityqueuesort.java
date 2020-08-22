/* two arrays given, A=[3,4,6,2,1], B=['a','c','t','d','w']
Get O/P = [[1,'a'],[2,'c'],[3,'d'],[4,'t'],[6,'w']]
note the sorted ints and chars
 * 
 * */
package com.ty.corejava.practice;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class TestPriorityqueuesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq=new PriorityQueue<>();
		pq.add(3);
		pq.add(4);
		pq.add(6);
		pq.add(2);
		pq.add(1);
		
		PriorityQueue pq1=new PriorityQueue<>();
		pq1.add("a");
		pq1.add("c");
		pq1.add("t");
		pq1.add("d");
		pq1.add("w");
		
		ArrayList al=new ArrayList<>();
		
		int size=pq.size();
		for(int i=0;i<size;i++)
		{
			al.add("["+pq.poll()+","+pq1.poll()+"]");
		}
		System.out.println(al);
		

	}

}
