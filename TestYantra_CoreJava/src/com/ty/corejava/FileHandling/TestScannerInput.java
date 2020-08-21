package com.ty.corejava.FileHandling;

import java.util.Scanner;

public class TestScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner sc=new Scanner(System.in)) {
			
			System.out.println("Enter Age:");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name:");
			String name = sc.nextLine();
			System.out.println("R u married?: ");
			boolean mrg = sc.nextBoolean();
			
			System.out.println("=============Detail===============");
			System.out.println("Age= "+age);
			System.out.println("name= "+name);
			System.out.println("Mrg Status= "+mrg);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
