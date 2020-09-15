package com.tyss.practicedesignpattern.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_info")
public class Employee implements Serializable {
	
	@Id
	@Column
	private int empId;
	@Column
	private String name;
	@Column(name="dateOfBirth")
	private Date date;
	@Column(name="emailId")
	private String email;
	@Column
	private int deptno;
	@Column
	private String designation;
	@Column(name="joiningDate")
	private Date jdate;
	@Column(name="managerId")
	private int mid;
	@Column
	private int mobileno;
	@Column
	private double salary;
	@Column
	private int age;

}
