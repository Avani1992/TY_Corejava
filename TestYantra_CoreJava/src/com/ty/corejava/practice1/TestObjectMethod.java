package com.ty.corejava.practice1;

public class TestObjectMethod {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		String s1=new String("Diya");
		String s2=new String("Diya");
		
		System.out.println("s1 hashcode= "+s1.hashCode());
		System.out.println("s2 hashcode= "+s2.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		Manager m1=new Manager("Riya", 10012);
		Manager m2=new Manager("Riya", 10012);
		
		System.out.println("M1 hashcode= "+m1.hashCode());
		System.out.println("M2 hashcode= "+m2.hashCode());
		
		System.out.println(m1.equals(m2));
		System.out.println(m1==m2);
		
		System.out.println(m2.toString());
		
		Manager m3=(Manager) m2.clone();
		System.out.println(m3.toString());
	}

}
