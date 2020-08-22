package com.ty.corejava.practice;

import java.util.Comparator;

public class PQSortname  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.sname.compareTo(o2.sname);
	}

	
	

}
