package com.ty.corejava.this_super;

public class Empoyee {
	
	String ename;
	int eid;
	
	static String cname;
	
	Empoyee(String ename,int eid,String cname)
	{
		this.ename=ename;
		this.eid=eid;
		Empoyee.cname=cname;
		
	}
	
	public void empdata()
	{
		System.out.println("Employee name is="+this.ename);
		System.out.println("Employee id is: "+this.eid);
		System.out.println("company name= "+Empoyee.cname);
	}
	
	
	

}
