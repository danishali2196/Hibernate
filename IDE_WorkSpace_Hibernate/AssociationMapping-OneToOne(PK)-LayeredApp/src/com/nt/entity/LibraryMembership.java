package com.nt.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ANNO_LIBRARYMEMBERSHIP")
@Setter
@Getter
public class LibraryMembership implements Serializable {
	@Id
	@GenericGenerator(name="gen1",strategy="foreign",parameters=@Parameter(name="property", value="studentDetail"))
	@Column(length=6)
	@Type(type="int")
	private int lid;
	
	@Type(type="date")
	private Date doj;
	
	
	@Column(length=6)
	@Type(type="float")
	private float fee;
	
	@OneToOne(targetEntity=Student.class,
							cascade=CascadeType.ALL,
							fetch=FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="lid",referencedColumnName="sid")
	private Student studentDetail;
	
	public LibraryMembership() {
		System.out.println("LibraryMembership::0-param constructor");
	}
}
