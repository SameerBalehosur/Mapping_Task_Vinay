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
import javax.persistence.OneToMany;

import lombok.Data;
@Data
@Entity
public class Coach implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String coachName;
	private String specialization;
	private String certificates;
	private String image;
	private String qualification;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_coach",joinColumns = {@JoinColumn(name="cid")},inverseJoinColumns = {@JoinColumn(name="uid")} )
	private List<User> user;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "coach")
	private List<Transformation> transform;
}
