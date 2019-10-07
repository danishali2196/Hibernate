package com.nt.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProgrammerProjectInfo implements Serializable {
	
	private ProgrammerProjectID id;
	private String prgmrName;
	private float salary;
	private String projName;
	

}
