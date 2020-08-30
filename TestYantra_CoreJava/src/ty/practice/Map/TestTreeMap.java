package ty.practice.Map;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> t1=new TreeMap<>();
		t1.put(10, "Red");
		t1.put(30, "Green");
		t1.put(50, "White");
		t1.put(20, "Black");
		t1.put(40, "Red");
		
		System.out.println(t1);
	
		
		System.out.println(t1.containsValue("Red"));
		
		Set<Integer> keySet = t1.keySet();
		for(Integer k1:keySet) {
			System.out.print(k1+" ");
		}System.out.println();
		
		System.out.println("Greater-equal key= "+t1.ceilingEntry(29));
		System.out.println("Less-equal key= "+t1.floorEntry(45));
		
		System.out.println("Lowest key= "+t1.firstKey());
		System.out.println("Highest key= "+t1.lastKey());
		
		
		System.out.println("First Entry= "+t1.firstEntry());
		System.out.println("Last Entry= "+t1.lastEntry());
		
		NavigableSet<Integer> desckey = t1.descendingKeySet();
		System.out.println("Descending keyset= "+desckey);
		
		System.out.println("Greatest key-lessthan current= "+t1.floorKey(35));
		
		SortedMap<Integer, String> headMap = t1.headMap(30);
		System.out.println("Less than= "+headMap);
		
		System.out.println("Stricktly greater= "+t1.higherKey(30));
		
		System.out.println("Stricktly lessthan= "+t1.lowerKey(30));
		
		  NavigableSet<Integer> navigableKeySet = t1.navigableKeySet();
		  System.out.println(navigableKeySet);
		  
		  System.out.println(t1.pollFirstEntry());
		  System.out.println(t1.pollLastEntry());
		  
		  t1.put(10, "Red");
		  t1.put(50, "Pink");
		  System.out.println(t1);
		  
		 
		  System.out.println("subMap="+t1.subMap(10, 30));
		  System.out.println("Submap= "+t1.subMap(30, true,50, true));
		  
		  System.out.println(t1.tailMap(20));
		  
		  
	}

}
