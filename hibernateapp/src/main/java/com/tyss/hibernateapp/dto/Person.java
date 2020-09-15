package com.tyss.hibernateapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="person_info")
public class Person implements Serializable{
	@Id
	@Column(name="id")
	private int pid;
	@Column
	private String name;
	@Column(name="email")
	private String emailId;
	
	
		
}
