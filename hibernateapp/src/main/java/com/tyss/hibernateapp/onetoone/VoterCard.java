package com.tyss.hibernateapp.onetoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import lombok.Data;

@Data
@Entity
@Table(name="votercard")
public class VoterCard implements Serializable {
	@Id
	@Column
	private int vid;
	@Column
	private String vname;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="vcard")// Bidirectional
	private User user;

}
