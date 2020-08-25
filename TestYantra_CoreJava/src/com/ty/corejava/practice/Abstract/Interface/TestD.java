package com.ty.corejava.practice.Abstract.Interface;

public class TestD extends AbstractC implements InterfaceA{

	@Override
	public void A() {
		System.out.println("Interface A method..");
		
	}
	
	@Override
	public void B() {
		System.out.println("Interface B method..");
		
	}

	@Override
	void m() {
		System.out.println("Abstract clss method..");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestD d=new TestD();
		
		d.A();
		d.B();
		d.m();
		
		
		
		
		
	}

	

	
}
