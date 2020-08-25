package com.ty.corejava.practice.Strings;

public class FirstoccuranceofWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Nothing is as easy as it seems” user enters";
		String s2="as";
		int le=s2.length();
		int indexOf = s1.indexOf(s2);
		System.out.println(s1.indexOf(s2));
		
		StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb.delete(indexOf, indexOf+le));
		
		String str="   Hello How r u??  ";
		
		System.out.println(str.trim());
		
		
	}
	

}
