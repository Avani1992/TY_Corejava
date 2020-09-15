package com.tyss.practicehibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Student_info")

public class Student implements Serializable{

	@Id
	@Column
	private int sid;
	@Column
	private String name;
	@Column
	private String emailId;
	@Column
	private int std;
	@Column
	private String stream;
	
}
