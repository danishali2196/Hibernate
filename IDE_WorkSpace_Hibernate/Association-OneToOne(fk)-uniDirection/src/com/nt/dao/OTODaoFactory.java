package com.nt.dao;

public class OTODaoFactory {
	
	public static OTODAO getInstance() {
		return new OTODaoImpl();
	}

}
