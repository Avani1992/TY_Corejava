package com.tyss.practicehibernate.onetomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="person_detail")
public class Person implements Serializable {
	
	@Id
	@Column
	private int pid;
	@Column
	private String name;
	@Column
	private String emailId;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="person")
	@JoinColumn(name="pid",nullable=false)
	
	private List<Simcard> sc;

}
