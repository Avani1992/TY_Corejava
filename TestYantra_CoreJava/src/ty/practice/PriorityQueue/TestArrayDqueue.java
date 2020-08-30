package ty.practice.PriorityQueue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class TestArrayDqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer>ad=new ArrayDeque<>();
		ad.add(34);
		ad.addFirst(12);;
		ad.offerFirst(16);
		ad.offerLast(56);
		ad.addLast(46);
		
		System.out.println(ad);
		
		Iterator<Integer> descitr = ad.descendingIterator();
		while(descitr.hasNext()) {
			System.out.println(descitr.next());
		}
		
		System.out.println(ad.element());
		
		System.out.println("First="+ad.pollFirst());
		System.out.println("First="+ad.pollFirst());
		
		ad.push(0);
		System.out.println(ad);
		
		

	}

}
