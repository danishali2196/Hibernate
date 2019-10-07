package com.nt.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PhoneNumber implements Serializable {
	
	private long phone;
	private String phoneType;
	private String provider;
	
	
	@Override
	public String toString() {
		return "PhoneNumber [phone=" + phone + ", phoneType=" + phoneType + ", provider=" + provider + "]";
	}

	
}
