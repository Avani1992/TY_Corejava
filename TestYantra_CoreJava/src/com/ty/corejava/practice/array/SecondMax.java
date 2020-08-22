/*WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1
 105, 90]
 * */
package com.ty.corejava.practice.array;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {20,0,31,45,100,1,105,90};
		
		int max=a[0];
		int max2=0;

		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max2=max;
				max=a[i];
			}
		}
		System.out.println("Max= "+max);
		System.out.println("Second Max= "+max2);
	}

}
