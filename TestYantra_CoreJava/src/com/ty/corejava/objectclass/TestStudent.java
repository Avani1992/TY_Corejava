package com.ty.corejava.objectclass;

public class TestStudent {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Student s1=new Student("Riya", 25);
		Student s2=new Student(new String("Riya"), 25);
		
		System.out.println(s1.toString());
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("After implementing hashcode and equal method="+s1.hashCode());
		System.out.println("After implementing hashcode and equal method="+s2.hashCode());
		
		
		System.out.println(s1.getClass());
		
		
		Student s3=(Student) s1.clone();
		System.out.println(s3.toString());
		
		
		s1=null;
		System.gc();

	}

}
