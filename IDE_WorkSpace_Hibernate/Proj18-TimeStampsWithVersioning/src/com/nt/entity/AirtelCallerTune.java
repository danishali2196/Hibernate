package com.nt.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class AirtelCallerTune implements Serializable {

	private int custid;
	private String custname;
	private String callertune;
	private long mobile;
	private Timestamp lastmodified;

}
