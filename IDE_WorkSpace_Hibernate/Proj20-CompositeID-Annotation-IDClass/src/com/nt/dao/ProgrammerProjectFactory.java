package com.nt.dao;

public class ProgrammerProjectFactory {
	
	public ProgrammerProjectDAO getInstance() {
		return new ProgrammerProjectImpl();
	}

}
