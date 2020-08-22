/*WAP to reverse the array itself, don’t print array in reverse – I want
current array reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so
your same array must be [78, 37, 29, 45, 90, 3] without using
temporary array.

 * */
package com.ty.corejava.practice.array;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,90,45,29,37,78};
		
		int size=a.length;
		int temp=0;
		
		for(int i=0;i<size/2;i++) {
			
			temp=a[i];
			a[i]=a[size-1-i];
			a[size-1-i]=temp;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		
	
		
		

	}

}
