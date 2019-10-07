package com.nt.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="AIRTEL_CALLERTUNE_TS1")
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
	
	@CreationTimestamp
	@Column(name="SUBSCRIBEDDATE")
	@Type(type="timestamp")
	private Timestamp subscribeddate;
	
	@UpdateTimestamp
	@Column(name="LASTMODIFIED")
	@Type(type="timestamp")
	private Timestamp lastmodified;
	
	@Version
	@Column(name="UPDATECOUNT",length=5)
	@Type(type="int")
	private int updatecount;

}
