package com.nt.entity;
// Generated May 25, 2019 11:21:53 PM by Hibernate Tools 5.2.3.Final

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Employee implements java.io.Serializable {

	private int eid;
	private String ename;
	private String desg;
	private BigDecimal salary;

	public Employee() {
	}

	public Employee(int eid) {
		this.eid = eid;
	}

	public Employee(int eid, String ename, String desg, BigDecimal salary) {
		this.eid = eid;
		this.ename = ename;
		this.desg = desg;
		this.salary = salary;
	}

	@Id

	@Column(name = "EID", unique = true, nullable = false, precision = 5, scale = 0)
	public int getEid() {
		return this.eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	@Column(name = "ENAME", length = 20)
	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Column(name = "DESG", length = 20)
	public String getDesg() {
		return this.desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Column(name = "SALARY", precision = 10)
	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}
