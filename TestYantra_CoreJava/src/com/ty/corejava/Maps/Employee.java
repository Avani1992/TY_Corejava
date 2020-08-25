package com.ty.corejava.Maps;

public class Employee implements Comparable<Employee>{

	int eid;
	String ename;
	
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return new Integer(this.eid).compareTo(o.eid);
	}
	
	
	
	
}
