/*Write a Java program to count total number of words in a string. E.g. String is
Str = “Hey how are you” output 4 words

11. Write a Java program to find reverse of a string. String str = “Hello”
Output: olleH

12. Write a Java program to check whether a string is palindrome or not. Means
Strings reverse is same string e.g. str = “madam” this string is palindrome
 * */
package com.ty.corejava.practice.Strings;

public class TotalWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Happy Goodmorning all of u...";
		
		String[] s2 = s1.split(" ");
		System.out.println(s2.length);

	}

}
