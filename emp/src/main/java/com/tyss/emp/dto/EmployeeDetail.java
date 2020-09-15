package com.tyss.emp.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_primaryinfo")
public class EmployeeDetail implements Serializable {
	@Id
	@Column
	private int eid;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private String dob;
	@Column
	private String email;
	@Column
	private long mobileno;
	@Column
	private double salary;
	@Column
	private String doj;
	@Column
	private String designation;
	@Column
	private int deptno;
}
