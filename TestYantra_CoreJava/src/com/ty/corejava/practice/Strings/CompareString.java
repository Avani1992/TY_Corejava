/*String toggle..*/
package com.ty.corejava.practice.Strings;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abCDrThJ123";
		char ch=' ';
		String s=" ";
	//	String str1=new String(ch);
		
		
		System.out.println("String before toggle:"+str);
						
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			
			if(ch>='A' && ch<='Z')
			{
				ch=(char) (ch+32);
				s=s+ch;
				//System.out.print(s);
			}
			else if(ch>='a' && ch<='z')
			{
				ch=(char) (ch-32);
				s=s+ch;
				//System.out.print(s);
			}
			else
			{
				s=s+ch;
			}
			
		}System.out.println("String after toggle:"+s);

	}

}
