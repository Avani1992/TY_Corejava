package com.ty.corejava.collection.Set;

public class Person implements Comparable<Person> {
	
	int pid;
	String pname;
	
	public Person(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return new Integer(this.pid).compareTo(o.pid);
	}
	
	

}
