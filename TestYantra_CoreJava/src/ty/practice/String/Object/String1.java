package ty.practice.String.Object;

public class String1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="ABC";
		String s2="BCD";
		String s3=new String("ABC");
		String s4=s2;
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		
		
		String s5=new String(new String("ABC"));
		System.out.println(s3==s5);
		
		
		
		

	}

}
