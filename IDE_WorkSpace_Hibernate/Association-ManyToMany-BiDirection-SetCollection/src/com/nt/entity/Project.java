package com.nt.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Project implements Serializable {
	
	private int projId;
	private String projName;
	private String domain;
	private Set<Programmer> programmers=new HashSet();
	
	public Project() {
		System.out.println("Project:0-param constructor");
	}

	@Override
	public String toString() {
		return "Project [projId=" + projId + ", projName=" + projName + ", domain=" + domain + "]";
	}
	
	

}
