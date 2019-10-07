package com.nt.dao;

public class M2ODaoFactory {
	
	public static M2ODao getInstance() {
		
		return new M2ODaoImpl();
		
	}
	

}
