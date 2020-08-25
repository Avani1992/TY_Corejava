/* Palindrome String...
 * 
 * */
package com.ty.corejava.practice.Strings;

public class palindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="madam";
		String s2="";
		int j=0;
		char ch;
		for(int i=s1.length()-1;i>=0;i--) {
			
			ch=s1.charAt(i);
			s2=s2+ch;
			j++;
			
		}
		if(s1.equals(s2)) {
			System.out.println("String Palindrome..");
		}else {
			System.out.println("String not Palindrome..");
		}
		
		

	}

}
