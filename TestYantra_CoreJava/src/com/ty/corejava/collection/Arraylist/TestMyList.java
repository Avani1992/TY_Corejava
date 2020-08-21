package com.ty.corejava.collection.Arraylist;

public class TestMyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyList<Integer> ml=new MyList<>();
		ml.add(10);
		ml.add(20);
		ml.add(30);
		ml.add(2, 70);
		ml.add(40);
		ml.add(50);
		ml.add(60);
		ml.add(130);
	
		
		for(int i=0;i<ml.size();i++)
		{
			System.out.println(ml.get(i));
		}
		System.out.println("===========After Remove=============");
		
		ml.remove(3);
		ml.remove(new Integer(130));
		
		for(int i=0;i<ml.size();i++)
		{
			System.out.println(ml.get(i));
		}
		
		

	}

}
