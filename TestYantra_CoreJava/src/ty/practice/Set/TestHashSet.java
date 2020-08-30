package ty.practice.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(10);
		hs.add(30);
		System.out.println(hs);
		
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}System.out.println();
		
		System.out.println(hs.size());
		
		
		HashSet<Integer> hs1=(HashSet<Integer>) hs.clone();
		System.out.println("Clone Hs1= "+hs1);
		hs1.add(50);
		hs1.add(60);
		
		Object[] array = hs.toArray();  // Hashset to Array
		for(Object o1:array) {
			System.out.print(o1+" ");
		}System.out.println();
		
		TreeSet<Integer> tr=new TreeSet<>(hs);
		System.out.println("Treeset= "+tr);
		
		ArrayList<Integer> al=new ArrayList<>(hs);
		System.out.println("ArrayList= "+al);
		
		System.out.println(hs.containsAll(hs1));
		
		hs.add(5);
		hs.add(6);
		hs.add(7);
		hs.retainAll(hs1);
		System.out.println("Retain= "+hs);
		
		System.out.println(hs);

	}
}
