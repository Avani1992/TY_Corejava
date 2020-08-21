package com.ty.corejava.singletoneclass;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=Student.classobject();
		s1.studentinfo();
		
		Student s2=Student.classobject();
		s2.studentinfo();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		
		
	

	}

}
