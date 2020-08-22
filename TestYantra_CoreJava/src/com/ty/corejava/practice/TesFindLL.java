/*2) Find the kth element in LL , k=3 , total node in LL = 5
 * */package com.ty.corejava.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class TesFindLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> l1=new  LinkedList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no: ");
		int k = sc.nextInt();
		
		for(int i=0;i<l1.size();i++)
		{
			if(i==k) {
				System.out.println(k+" rd element= "+l1.get(i));
			}
			else {
				throw new IndexOutOfBoundsException();
			}
		}
		

	}

}
