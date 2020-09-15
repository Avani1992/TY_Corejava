package com.tyss.hibernateapp.manytoone;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="pencilbox")
public class PencilBox implements Serializable {
	@Id
	@Column
	private int bid;
	@Column
	private String bname;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="box")
	private List<Pencil> pencil;
}
