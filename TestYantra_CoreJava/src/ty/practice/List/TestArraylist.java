package ty.practice.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al.size());
		System.out.println(al.contains(20));
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(20);
		al2.add(30);
		
		System.out.println(al.containsAll(al2)); // True
		
		al.add(0, 56); // Add at first index
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		al.remove(3);
		System.out.println(al);

		
		Collections.sort(al);  // sort
		System.out.println("Sort= "+al);
		
		ArrayList<Integer> al1=new ArrayList<>();
		al1.addAll(al);  // copy
		System.out.println(al1);
		
		for(int i=al.size()-1;i>=0;i--) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		ArrayList<Integer>al3=new ArrayList<>();
		al3.addAll(al.subList(1, 4));
		System.out.println("Extrect list= "+al3);
		
		Collections.swap(al3, 0,2);  // Swap element
		System.out.println("Swap= "+al3);
		
		Object clone = al.clone();  // clone
		System.out.println(clone);
		
		al2.clear();
		System.out.println(al2.isEmpty());
		
		al.trimToSize();
		System.out.println(al);
		
		

	}

}
