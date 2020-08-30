package ty.practice.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinklist {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(10);
		l1.add(1, 20);
		l1.addLast(30);
		l1.addFirst(5);
		l1.add(10);
		
		Iterator<Integer> itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}System.out.println();
		
		Iterator<Integer> descitr = l1.descendingIterator();
		while(descitr.hasNext()) {
			System.out.print(descitr.next()+" ");
		}System.out.println();
		
		ListIterator<Integer> listitr = l1.listIterator(1);  // iterate threw specific position
		while(listitr.hasNext()) {
			System.out.print(listitr.next()+" ");
		}
		System.out.println();
		
//		ListIterator<Integer> itr1 = l1.listIterator();
//		while(itr1.hasPrevious()) {
//			System.out.println(itr1.previous());
//		}
		
		l1.offerFirst(1);
		l1.offerLast(35);
		System.out.println(l1);
		System.out.println(l1.pop());
		
		System.out.println(l1.indexOf(10));
		System.out.println(l1.lastIndexOf(10));
		
		l1.remove(new Integer(5));
		System.out.println(l1);

		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		
		Collections.swap(l1, 0, 2);
		System.out.println("Swap= "+l1);
		
		Collections.shuffle(l1);
		System.out.println("Shuffle= "+l1);
		
		LinkedList<Integer> l2=new LinkedList<>();
		l2.add(100);
		l2.offer(200);
		l2.offerFirst(50);
		l2.offerLast(300);
		System.out.println("l2= "+l2);
		
		l1.addAll(l2);
		System.out.println(l1);
		
		LinkedList<Integer> l3=(LinkedList<Integer>) l1.clone();
		System.out.println("L3= "+l3);
		
		System.out.println("Poll="+l3.pollFirst());  // retrieves & remove
		System.out.println(l3);
		System.out.println("Remove="+l3.removeFirst());  // remove & return
		System.out.println(l3);
		
		System.out.println("Peek= "+l3.peekFirst());  // retrieve & not remove
		System.out.println(l3);
		
		ArrayList<Integer> al=new ArrayList<>(l1);
		System.out.println("ArrayList= "+al);
		
		
		
		
		
		
	}
	
}
