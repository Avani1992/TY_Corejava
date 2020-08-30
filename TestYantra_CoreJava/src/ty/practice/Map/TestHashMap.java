package ty.practice.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "Red");
		hm.put(2, "Green");
		hm.put(3, "Black");
		hm.put(1, "Pink");
		hm.put(null, "White");
		hm.put(null, "Peech");
		hm.put(4, "Yellow");
		
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		hm.remove(null);
		System.out.println(hm);
		
		Object clone = hm.clone();
		System.out.println(clone);
		
		System.out.println(hm.get(2));
		
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		for(Entry<Integer, String>e1:entrySet) {
			System.out.println(e1.getKey()+" -> "+e1.getValue());
		}
		
		Set<Integer> keySet = hm.keySet();
		for(Integer k1:keySet) {
			System.out.print(k1+" ");
		}System.out.println();
		
		Collection<String> values = hm.values();
		for(String v:values) {
			System.out.print(v+" ");
		}System.out.println();
		
		
	}

}
