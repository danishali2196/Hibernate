package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="MTO_Department")
@Setter
@Getter
public class Department {
	@Id
	@Column(length=15)
	@Type(type="int")
	private int deptNo;
	
	@Column(length=15)
	@Type(type="string")
	private String deptName;
	
	@Column(length=15)
	@Type(type="string")
	private String deptHead;

}
