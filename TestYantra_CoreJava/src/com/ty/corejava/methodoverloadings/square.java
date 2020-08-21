package com.ty.corejava.methodoverloadings;

public class square {

	public void shape(String color,int edges,double value)
	{
		System.out.println("Square color="+color+" edges= "+edges+" value= "+value );
	}
	
	public void shape(int edges,double value,String color)
	{
		System.out.println("Square color="+color+" edges= "+edges+" value= "+value );
	}
	
	public void shape(double value,String color,int edges)
	{
		System.out.println("Square color="+color+" edges= "+edges+" value= "+value );
	}
	
}
