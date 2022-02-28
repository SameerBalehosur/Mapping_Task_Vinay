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
public class Orders implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oId;
	private int pId;
	private int userId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private User user;
}
