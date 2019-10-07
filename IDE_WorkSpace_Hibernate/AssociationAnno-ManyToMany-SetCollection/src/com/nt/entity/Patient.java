package com.nt.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="M2M_PATIENT")
@Setter
@Getter
public class Patient implements Serializable {
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(length=5)
	@Type(type="int")
	private int pid;
	
	@Column(length=15)
	@Type(type="string")
	private String pname;
	
	@Column(length=15)
	@Type(type="string")
	private String deasise;

	@ManyToMany(targetEntity=Doctor.class,cascade=CascadeType.ALL,
							fetch=FetchType.LAZY,mappedBy="patients")
	private Set<Doctor> doctors = new HashSet();
}

