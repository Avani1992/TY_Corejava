package com.ty.corejava.collection.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

import com.ty.corejava.constructors.parameterized_constructor;

public class TestPriorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.add(23);
		pq.add(12);
		pq.add(34);
		pq.add(45);
		pq.add(1);
		pq.add(10);
		pq.add(56);
		
		 System.out.println(pq.poll());
		 System.out.println(pq.poll());
		 System.out.println(pq.poll());
		 System.out.println(pq.poll());
		 System.out.println(pq.poll());
		 System.out.println(pq.poll());
		 System.out.println(pq.poll());
		 
		 
		 pq.remove(12);
		 
		 System.out.println(pq);
		 
		 System.out.println(pq.contains(34));
		 pq.offer(0);
		 System.out.println(pq);
		 
		 pq.remove(10);
		 System.out.println(pq);
		 
		 Object[] array = pq.toArray();
		 for(Object ar:array)
		 {
			 System.out.println(ar);
		 }
		 
		 Iterator<Integer> itr = pq.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
	}

}
