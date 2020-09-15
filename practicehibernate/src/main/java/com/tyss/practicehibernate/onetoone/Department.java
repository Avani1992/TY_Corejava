package com.tyss.practicehibernate.onetoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Department_info")
public class Department implements Serializable {
	
	@Id
	@Column
	private int deptID;
	@Column
	private String dname;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="dept")
	private Employee e;

}
