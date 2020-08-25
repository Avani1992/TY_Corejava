package com.ty.corejava.practice.Strings;

public class FrequencyOfChar {
	
	public static  void frequent(String str)
	{
			char ch=' ';
			
		while(str.length()>0)	
		{
			ch=str.charAt(0);
			
			System.out.println(ch+ " "+"occured"+" "+ data(str,ch)+" "+"times");
		    str=str.replaceAll(""+ch,"");
			//System.out.println(str);
			}
			
	}

	public static int data(String s,char ch)
	{
		int count=0;

				
		while(s.indexOf(ch)!=-1)
		{
			count++;
			s=s.substring(s.indexOf(ch)+1);
		}return count;	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hi Hello";
		frequent(s1);
//		char ch[] = s1.toCharArray();
//		char ch1;
//		char ch2[]=new char[10];
//		
//		for(int i=0;i<ch.length;i++) {
//			System.out.println(ch[i]);
//		}
//		
//		for(int i=0;i<ch.length;i++) {
//			
//			int count=1;
//			for(int j=i+1;j<ch.length;j++) {
//				
//				if(ch[i]==ch[j]) {
//					
//					count++;
//				}
//				
//			}System.out.println("Count of "+ch[i]+"="+count);
//		}
		
		
	

	}

}
