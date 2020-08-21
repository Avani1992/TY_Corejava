package com.ty.corejava.practice1;

import java.util.Scanner;

public class TestCustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Check Person Age..");
		PersonAge pa=new PersonAge();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		pa.personAge(age);
		
		

	}

}
