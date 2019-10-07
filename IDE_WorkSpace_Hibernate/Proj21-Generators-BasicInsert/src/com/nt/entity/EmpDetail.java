package com.nt.entity;

import java.io.Serializable;

public class EmpDetail implements Serializable {
	
	private int eid;
	private String ename;
	private String desg;
	private float salary;
	
	
	public EmpDetail() {
		System.out.println("EmpDetail::0-param constructor");
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public float getSalary() {
		return salary;
	}
	

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}
