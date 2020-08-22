/*rotate elements by k rotations
k=4
arr= [34,5,55,9,1,0,31,12]
O/P= [1,0,31,12,34,5,55,9]
 * 
 * */
package com.ty.corejava.practice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class TestDequeueRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.add(34);
		ad.add(5);
		ad.add(55);
		ad.add(9);
		ad.add(1);
		ad.add(0);
		ad.add(31);
		ad.add(12);
		
		System.out.println(ad);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rotation: ");
		int rotation = sc.nextInt();
		
		for(int i=0;i<ad.size();i++)
		{
			if(i<rotation) {
				ad.addLast(ad.getFirst());
				ad.removeFirst();
			}
				
		}
		System.out.println(ad);
		

	}

}
