package com.tyss.employeemanagementsystem.servlet.dto;





import java.sql.Date;

import lombok.Data;

@Data
public class Employee{
	
	private int eid;
	private String fname;
	private Date doj;
	private Date dob;
	private int age;
	private String deptname;
	private String grade;
	private String designation;
	private String gender;
	private String matirialstatus;
	private String address;
	private String phoneno;
	
	public Employee(){}
	
	public Employee(int eid, String fname, Date doj, Date dob, int age, String deptname, String grade,
			String designation, String gender, String matirialstatus, String address, String phoneno) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.doj = doj;
		this.dob = dob;
		this.age = age;
		this.deptname = deptname;
		this.grade = grade;
		this.designation = designation;
		this.gender = gender;
		this.matirialstatus = matirialstatus;
		this.address = address;
		this.phoneno = phoneno;
	}
	
	

}
