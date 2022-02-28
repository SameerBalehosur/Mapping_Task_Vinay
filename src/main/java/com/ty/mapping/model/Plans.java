package com.ty.mapping.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Plans implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pdid;
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_plan" ,joinColumns = {@JoinColumn(name="uid")},inverseJoinColumns ={@JoinColumn(name="pdid")}  )
	private List<User> user;
}
