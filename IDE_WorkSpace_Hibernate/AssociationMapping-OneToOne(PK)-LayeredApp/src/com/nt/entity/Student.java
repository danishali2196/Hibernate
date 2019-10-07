package com.nt.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ANNO_STUDENT")
@Setter
@Getter
public class Student implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(length=5)
	@Type(type="int")
	private int sid;
	
	@Column(length=15)
	@Type(type="string")
	private String name;
	
	@Type(type="date")
	private byte age;
	
	@OneToOne(targetEntity=LibraryMembership.class,
							cascade=CascadeType.ALL,
							fetch=FetchType.LAZY,
							mappedBy="studentDetail")
	private LibraryMembership libDetail;
	
	public Student() {
		System.out.println("Student::0-param constructor");
	}
}
