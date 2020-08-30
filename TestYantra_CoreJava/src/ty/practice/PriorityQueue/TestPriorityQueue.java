package ty.practice.PriorityQueue;

import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(10);
		pq.add(20);
		pq.offer(34);
		pq.add(12);
		pq.add(3);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		System.out.println(pq.peek());
		
	}
}
