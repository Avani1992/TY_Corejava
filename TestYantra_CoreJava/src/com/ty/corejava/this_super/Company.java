package com.ty.corejava.this_super;

public class Company extends Empoyee{
	
	String cowner;
	
	Company(String ename,int eid,String cowner,String cname)
	{
		super(ename, eid, cname);
		this.cowner=cowner;
	}
	
	public void companyinfo()
	{
		super.empdata();
		System.out.println("Company owner is: "+this.cowner);
	}

}
