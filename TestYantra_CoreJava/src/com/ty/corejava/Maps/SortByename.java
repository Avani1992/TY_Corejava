package com.ty.corejava.Maps;

import java.util.Comparator;

public class SortByename implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.ename.compareTo(o2.ename);
	}

}
