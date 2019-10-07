package com.nt.dao;

public class O2MDaoFactory {
	
	public static O2MDao getInstance() {
		return new O2MDaoImpl();
	}

}
