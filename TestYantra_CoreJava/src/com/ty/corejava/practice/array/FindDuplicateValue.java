/*Write a Java program to find the duplicate values of an array of integer
values. Means e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so
duplicates are 10 and 78. */
package com.ty.corejava.practice.array;

public class FindDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,10,90,78,56,10,78,34,61};
		
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		

	}

}
