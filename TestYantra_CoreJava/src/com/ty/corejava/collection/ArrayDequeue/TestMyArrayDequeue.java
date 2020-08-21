package com.ty.corejava.collection.ArrayDequeue;

public class TestMyArrayDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArrayDequeue md=new MyArrayDequeue();
		
		md.add(10);
		md.add(20);
		md.add(30);
		md.add(40);
		
		System.out.println(md);
		
		System.out.println("========remove=========");
		md.remove();
		System.out.println(md);

	}

}
