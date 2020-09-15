package com.tyss.practicedatabasequery.manytomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="customer_info")
public class customer implements Serializable {
	@Id
	@Column
	private int cid;
	@Column
	private String cname;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="customer_product" ,joinColumns=@JoinColumn(name="cid"),
	inverseJoinColumns=@JoinColumn(name="pid"))
	private List<Product> product;

}
