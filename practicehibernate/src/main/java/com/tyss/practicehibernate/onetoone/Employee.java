package com.tyss.practicehibernate.onetoone;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_info")
public class Employee implements Serializable {
	
	@Id
	@Column
	private int empID;
	@Column
	private String name;
	@Column(name="JoiningDate")
	private Date jdate;
	@Column
	private double salary;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="deptID")
	private Department dept;
	

}
