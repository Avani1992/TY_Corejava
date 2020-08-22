/*WAP to print maximum in columns. Means e.g. arr[][] = {{22,
31, 9}, {12, 25, 16}} output is: 31 and 25.
 * */
package com.ty.corejava.practice.array;

public class MaximumColum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{22,31,9},{12,25,16}};
		
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<3;j++) {
				
				for(int k=j+1;j<3;j++) {
					
					if(a[i][j]<a[i][k]) {
						System.out.println(a[i][k]);
					}
				}
				
			}
		}

	}

}
