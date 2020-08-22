/* record= [('Kuman',26),('JKUU',28),('rsnsk',67),('Aekss',8),('nnjn',88)]
Get this record sorted by name*/
package com.ty.corejava.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class TestPQname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Student> pq=new PriorityQueue<>(5,new PQSortname());
		pq.add(new Student("Kuman",45));
		pq.add(new Student("Jkuu",28));
		pq.add(new Student("Rsskkf",67));
		pq.add(new Student("Aekss",45));
		pq.add(new Student("Kkj",88));
		
		int size=pq.size();
		for(int i=0;i<size;i++) {
			System.out.println(pq.poll());
		}
		
		
		
		

	}

}
