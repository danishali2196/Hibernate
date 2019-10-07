package com.nt.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="AIRTEL_CALLERTUNE_TS")
public class AirtelCallerTune implements Serializable {

	@Id
	@Column(name="CUSTID", length=5)
	@Type(type="int")
	private int custid;
	
	@Column(name="CUSTNAME", length=15)
	@Type(type="string")
	private String custname;
	
	@Column(name="CALLERTUNE", length=15)
	@Type(type="string")
	private String callertune;
	
	@Column(name="MOBILE", length=10)
	@Type(type="long")
	private long mobile;
	
	@UpdateTimestamp
	@Column(name="LASTMODIFIED")
	@Type(type="timestamp")
	private Timestamp lastmodified;

}
