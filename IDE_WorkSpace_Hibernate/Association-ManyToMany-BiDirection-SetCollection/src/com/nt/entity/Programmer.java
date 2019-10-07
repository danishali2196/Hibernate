package com.nt.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Programmer implements Serializable {

	private int pId;
	private String pName;
	private float salary;
	private Set<Project> projects=new HashSet<>();
	
	public Programmer() {
		System.out.println("Programmer:0-param constructor");
	}

	@Override
	public String toString() {
		return "Programmer [pId=" + pId + ", pName=" + pName + ", salary=" + salary + "]";
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	
	
	
	
}
