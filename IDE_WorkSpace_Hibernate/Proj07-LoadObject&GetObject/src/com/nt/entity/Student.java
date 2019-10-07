package com.nt.entity;

import java.io.Serializable;

import org.hibernate.annotations.Proxy;


public final class Student  implements Serializable{
	private int sno;
	private String sname;
	private String course;
	private int fee;
	public Student() {
		System.out.println("Student.Student()");
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", course=" + course + ", fee=" + fee + "]";
	}
	
	
	

}
