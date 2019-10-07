package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Type;

import lombok.Data;

@Entity
@Data
@Table(name="AIRTEL_CALLERTUNE")
public class AirtelCallerTune implements Serializable {

	@Id
	@Column(name="CUSTID",length=5)
	@Type(type="int")
	private int custId;
	
	@Column(name="CUSTNAME",length=15)
	@Type(type="string")
	private String custName;
	
	@Column(name="CALLERTUNE",length=15)
	@Type(type="string")
	private String callerTune;
	
	@Column(name="MOBILE",length=10)
	@Type(type="long")
	private long mobile;
	
	@Version
	@Column(name="UPDATIONSTIMES",length=10)
	@Type(type="int")
	private int updationsTime;

}
