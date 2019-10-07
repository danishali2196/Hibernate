package com.nt.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class AirtelCallerTune implements Serializable {

	private int custId;
	private String custName;
	private String callerTune;
	private long mobile;
	private int updationsTime;

}
