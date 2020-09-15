package com.tyss.practicedatabasequery.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student_info")
public class Student implements Serializable{
	
	@Id
	@Column
	private int sid;
	@Column
	private String sname;
	@Column
	private int std;
	@Column
	private String Stream;
	@Column
	private Date dob;

}
