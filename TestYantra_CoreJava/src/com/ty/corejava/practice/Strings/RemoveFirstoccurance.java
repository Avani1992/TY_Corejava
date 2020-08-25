package com.ty.corejava.practice.Strings;

public class RemoveFirstoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hi Hello";
		String s2="";
		String s3="";
		char ch='H';
		
		for(int i=0;i<s1.length();i++) {
			
			if(s1.indexOf(ch)!=i) {
				s2=s2+s1.charAt(i);
			}
			
		}
		System.out.println(s2);
		
		// Remove all occurance
		
		for(int i=0;i<s1.length();i++) {
			if(ch!=s1.charAt(i)) {
				s3=s3+s1.charAt(i);
			}
		}
		System.out.println("Remove all occurance: "+s3);

	}

}
