package ty.practice.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Evenno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i<=50;i++) {
			al.add(i);
		}
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			if(itr.next()%2!=0) {
				System.out.print(itr.next()+" ");
			}
		}
		System.out.println();
		
		
		
	}

}
