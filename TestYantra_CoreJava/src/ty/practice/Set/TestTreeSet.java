package ty.practice.Set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> tr=new TreeSet<>();
		tr.add("Red");
		tr.add("Blue");
		tr.add("Pink");
		tr.add("Black");
		tr.add("Yellow");
		
		System.out.println(tr);
		
		Iterator<String> itr = tr.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}System.out.println();
		
		Iterator<String> descitr = tr.descendingIterator();
		while(descitr.hasNext()) {
			System.out.print(descitr.next()+" ");
		}System.out.println();
		
		NavigableSet<String> descendingSet = tr.descendingSet();
		System.out.println(descendingSet);
		
		System.out.println(tr.first());
		System.out.println(tr.last());
		System.out.println(tr);
		
		TreeSet<Integer> tr1=new TreeSet<>();
		tr1.add(1);
		tr1.add(15);
		tr1.add(10);
		tr1.add(5);
		tr1.add(3);
		tr1.add(34);
		
		System.out.println("tr1= "+tr1);
		
		System.out.println("Headset="+tr1.headSet(7));  // no. less than 7.
		
		System.out.println("Ceil="+tr1.ceiling(6));  // greterthan or equal
		
		System.out.println("Floor="+tr1.floor(6));  // less than or equal
		
		System.out.println("Higher="+tr1.higher(5));  // stricktly higher
		
		System.out.println("Lower="+tr1.lower(5));  // stricktly lower
		
		System.out.println("Treeset= "+tr1);
		System.out.println("Retrieve,Remove First="+tr1.pollFirst());
		System.out.println("Retrieve,Remove Last="+tr1.pollLast());
		System.out.println("Remove= "+tr1.remove(new Integer(10)));
		System.out.println("Treeset= "+tr1);
		
	}

}
