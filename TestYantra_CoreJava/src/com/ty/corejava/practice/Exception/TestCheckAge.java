package com.ty.corejava.practice.Exception;

public class TestCheckAge {
	
	public void checkAge(int age) {
		
		try {
			if(age<18) {
			
				throw new AgeException();
			}
			System.out.println("You r eligible for voting..");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestCheckAge tc=new TestCheckAge();
		tc.checkAge(14);

	}

}
