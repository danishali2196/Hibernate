package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Programmer_Project")
public class ProgrammerProjectInfo implements Serializable {
	@EmbeddedId
	private ProgrammerProjectID id;
	@Column(name="PRGMRNAME")
	private String prgmrName;
	@Column(name="SALARY")
	private float salary;
	@Column(name="PROJNAME")
	private String projName;
	

}
