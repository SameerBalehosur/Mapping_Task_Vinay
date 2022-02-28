package com.ty.mapping.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class Transformation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tid;
	private String feedback;
	private String video;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private Coach coach;
}
