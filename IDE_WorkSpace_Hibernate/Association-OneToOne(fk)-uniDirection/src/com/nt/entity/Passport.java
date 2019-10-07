package com.nt.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Passport {

	private int psptNo;
	private String country;
	private Date validFrom;
	private Date validTo;
	private Person passportHolder;
	
	
	@Override
	public String toString() {
		return "Passport [psptNo=" + psptNo + ", country=" + country + ", validFrom=" + validFrom + ", validTo="
				+ validTo + "]";
	}
	
	
}
