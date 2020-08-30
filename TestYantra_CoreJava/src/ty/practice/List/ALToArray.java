package ty.practice.List;

import java.util.ArrayList;

public class ALToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		// First
		Object[] array = al.toArray();
		for(Object a:array) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		//Second
		Integer a1[]=new Integer[al.size()];
		for(int i=0;i<al.size();i++) {
			a1[i]=al.get(i);
		}
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}System.out.println();

		//Third
		Integer a2[]=new Integer[al.size()];
		a2=al.toArray(a2);
		for(int i=0;i<a2.length;i++) {
			System.out.print(a2[i]+" ");
		}System.out.println();
	}

}
