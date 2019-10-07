package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.Type;

@Entity
@Table(name="EMPLOYEE")
//@Proxy
//@Proxy(lazy=false)
//@Proxy(lazy=true,proxyClass=IEmp.class)
//@DynamicUpdate()
public class EmpDetail implements Serializable,IEmp {
	
	private int eid;
	private String ename;
	private String desg;
	private float salary;
	
	
	public EmpDetail() {
		System.out.println("EmpDetail::0-param constructor");
	}
	@Id
	@Column(name="EID",length=10)
	@Type(type="int")
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	@Column(name="ENAME",length=15)
	@Type(type="string")
	//@Transient        //this column not perform any persitence operation
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Column(name="DESG",length=15)
	@Type(type="string")
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Column(name="SALARY",length=10)
	@Type(type="float")
	public float getSalary() {
		return salary;
	}
	

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}
