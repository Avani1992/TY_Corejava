package com.ty.corejava.inheritances;

public class TestHybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		grand_daughter gd=new grand_daughter();
		gd.parentmoney();
		gd.childmoney();
		gd.gmoney();
		
		System.out.println("--------------------");
		
		daughter d=new daughter();
		d.parentmoney();
		d.dmoney();

	}

}
