package com.ty.corejava.practice.Exception;

public class Testnumberformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ch="ABC";
		
		try {
			System.out.println(Integer.parseInt(ch));
			}catch (NumberFormatException e) {
				System.out.println("can't cast to Integer..");
			}

	}

}
