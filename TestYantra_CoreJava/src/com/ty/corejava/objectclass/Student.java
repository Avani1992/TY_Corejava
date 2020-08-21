package com.ty.corejava.objectclass;

public class Student implements Cloneable {

	String stuname;
	int stuid;
	
	public Student(String stuname,int stuid) {
		
		this.stuid=stuid;
		this.stuname=stuname;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student name= "+stuname +" "+"Student id= "+stuid;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stuid;
		result = prime * result + ((stuname == null) ? 0 : stuname.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (stuid != other.stuid)
			return false;
		if (stuname == null) {
			if (other.stuname != null)
				return false;
		} else if (!stuname.equals(other.stuname))
			return false;
		return true;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize method called...");
	}
	
	
}
