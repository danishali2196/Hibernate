package com.nt.dao;

public class M2MDAOFactory {
	
	public static M2MDAO getInstance() {
		return new M2MDAOImpl();
	}

}
