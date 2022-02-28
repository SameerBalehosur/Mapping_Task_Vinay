package com.ty.mapping.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	private String userName;
	private long phoneNo;
	private String email;
	private double height;
	private double weight;

	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "user")
	private java.util.List<Plans> plans; 
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	private java.util.List<Orders> orders;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "user")
	private java.util.List<Coach> coach;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	private java.util.List<Products> products;

}
