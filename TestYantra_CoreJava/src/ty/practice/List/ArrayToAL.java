package ty.practice.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First
		Integer a[]= {10,20,30,40};
		List<Integer> asList = Arrays.asList(a);
		System.out.println(asList);
		
		// Second
		ArrayList<Integer> a1=new ArrayList<>();
		Collections.addAll(a1, a);
		System.out.println(a1);
		
		//Third
		ArrayList<Integer> a2=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			a2.add(a[i]);
		}
		System.out.println(a2);
	}

}
