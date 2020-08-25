package com.ty.corejava.collection.Set;

import java.util.Comparator;

public class SortByPname implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.pname.compareTo(o2.pname);
	}

}
