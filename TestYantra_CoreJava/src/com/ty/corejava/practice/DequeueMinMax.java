/*arr=[32,5,65,46,-4,90,18,19,-3,-5,-7]
find out min and max value using deque
 * 
 * */
package com.ty.corejava.practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DequeueMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.add(32);
		ad.add(5);
		ad.add(65);
		ad.add(46);
		ad.add(-4);
		ad.add(90);
		ad.add(18);
		ad.add(19);
		ad.add(-3);
		ad.add(-5);
		ad.add(-7);
		
		ArrayList<Integer> al =new ArrayList<>(ad);
		Integer max = Collections.max(al);
		
		System.out.println(max);
		
		Integer min = Collections.min(al);
		
		System.out.println(min);
		


	}

}
