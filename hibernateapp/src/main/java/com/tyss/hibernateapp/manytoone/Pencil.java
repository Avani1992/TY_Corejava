package com.tyss.hibernateapp.manytoone;

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
@Table(name="pencil_info")

public class Pencil implements Serializable{
	@Id
	@Column
	private int pid;
	@Column
	private String name;
	@Exclude
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bid")

	private PencilBox box;

}
