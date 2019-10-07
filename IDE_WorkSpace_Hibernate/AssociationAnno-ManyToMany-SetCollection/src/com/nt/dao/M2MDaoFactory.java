package com.nt.dao;

public class M2MDaoFactory {
	
	public static M2MDao getInstance() {
		return new M2MDaoImpl();
	}

}
