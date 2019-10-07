package com.nt.entity;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="O2M_Bank2")
public class Bank {
	@Id
	@Column(name="BANKID",length=15)
	@Type(type="int")
	private int bankId;
	
	@Column(name="BANKNAME",length=15)
	@Type(type="string")
	private String bankName;
	
	@Column(name="LOCATION",length=15)
	@Type(type="string")
	private String location;
	
	@OneToMany(targetEntity=Customer.class, 
			cascade=CascadeType.ALL,
			fetch=FetchType.LAZY,
			orphanRemoval=true )
	@JoinColumn(name="bankId", referencedColumnName="bankId")
	//@Fetch(FetchMode.JOIN)  		//fetchMode not work with HQL
	@MapKeyColumn(name="map_indx", nullable=true)
	private Map<String,Customer> accHolder;

	public Bank() {
		System.out.println("Bank:0-param constructor");
	}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", location=" + location + "]";
	}
	
	
}
