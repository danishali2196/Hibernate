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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="M2M_DOCTOR")
@Getter
@Setter
public class Doctor implements Serializable {
	@Id
	@Column(length=5)
	@Type(type="int")
	@SequenceGenerator(name="gen1",sequenceName="DOC_SEQ",initialValue=100,allocationSize=1)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	private int did;
	
	@Column(length=15)
	@Type(type="string")
	private String dname;
	
	@Column(length=15)
	@Type(type="string")
	private String specialization;

	@ManyToMany(targetEntity=Patient.class,cascade=CascadeType.ALL,
								fetch=FetchType.LAZY)
	@JoinTable(name="M2M_DOCTORS_PATIENTS", 
						joinColumns=@JoinColumn(name="doc_id",referencedColumnName="did"), 
						inverseJoinColumns=@JoinColumn(name="patient_id",referencedColumnName="pid"))
	private Set<Patient> patients = new HashSet();
}
