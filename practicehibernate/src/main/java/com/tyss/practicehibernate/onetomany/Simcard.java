package com.tyss.practicehibernate.onetomany;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="sim_detail")
public class Simcard implements Serializable{

	@Id
	@Column
	private int sid;
	@Column
	private String cname;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pid")
	private Person person;
	
}
