package com.tyss.practicedatabasequery.manytomany;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product_info")
public class Product implements Serializable {
	
	@Id
	@Column
	private int pid;
	@Column
	private String pname;

}
