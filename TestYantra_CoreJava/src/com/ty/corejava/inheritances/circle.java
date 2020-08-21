package com.ty.corejava.inheritances;

public class circle implements shape,color {

	@Override
	public void color() {
		
		System.out.println("Color method of interface");
		
	}

	@Override
	public void shape() {
		System.out.println("Shape method of interface");
		
	}
	
	

}
