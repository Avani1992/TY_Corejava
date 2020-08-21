package com.ty.corejava.practice1;

public class Manager implements Cloneable {
	
	String mname;
	int mid;
	
	Manager(String mname,int mid)
	{
		this.mname=mname;
		this.mid=mid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mid;
		result = prime * result + ((mname == null) ? 0 : mname.hashCode());
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
		Manager other = (Manager) obj;
		if (mid != other.mid)
			return false;
		if (mname == null) {
			if (other.mname != null)
				return false;
		} else if (!mname.equals(other.mname))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.mname+" "+this.mid;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
