package com.tyss.webapp.servlet.bean;

public class EmployeeBean {
	
	private int empid;
	private String empname;
	public EmployeeBean(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	

}
