package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="CUSTOMER")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ACCNO",length=15)
	@Type(type="int")
	private int accNo;
	
	@Column(name="HNAME",length=15)
	@Type(type="string")
	private String hName;
	
	@Column(name="BALANCE",precision=2 , scale=10)
	@Type(type="float")
	private float balace;
	
	public Customer() {
		System.out.println("Customer:0-param constructor");
	}

	@Override
	public String toString() {
		return "Customer [accNo=" + accNo + ", hName=" + hName + ", balace=" + balace + "]";
	}
	
	
	

}
