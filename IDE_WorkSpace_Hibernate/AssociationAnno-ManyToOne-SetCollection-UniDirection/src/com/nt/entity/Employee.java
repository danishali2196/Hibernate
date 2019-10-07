package com.nt.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="MTO_Employee")
@Setter 
@Getter
public class Employee {
	@Id
	@Column(length=5)
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Type(type="int")
	private int empId;
	@Column(length=15)
	@Type(type="string")
	private String ename;
	@Column(precision=2,scale=10)
	@Type(type="float")
	private float sal;
	
	@ManyToOne(targetEntity=Department.class,
							cascade=CascadeType.ALL,
							fetch=FetchType.LAZY)
	@JoinColumn(name="dept_no",referencedColumnName="deptNo")
	@Fetch(FetchMode.JOIN)
	private Department dept;

}
