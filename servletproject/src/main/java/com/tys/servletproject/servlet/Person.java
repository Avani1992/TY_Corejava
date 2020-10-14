package com.tys.servletproject.servlet;

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
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String email;

}
