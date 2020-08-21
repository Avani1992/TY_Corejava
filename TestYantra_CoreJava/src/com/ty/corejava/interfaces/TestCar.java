package com.ty.corejava.interfaces;

import java.util.function.Function;
import java.util.function.Predicate;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();
		c.v.start();
		
		Predicate<Integer> p = (i) ->{
			
			if(i>10)
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		
		System.out.println(p.test(23));
		
		Function<Integer, Integer> f = (i) ->{
			
			return i;
		};
		
		System.out.println(f.apply(20));
	}

}
