package com.nt.test;

import org.hibernate.Session;

import com.nt.dao.ProgrammerProjectDAO;
import com.nt.dao.ProgrammerProjectFactory;

public class CompositeIdTest {

	public static void main(String[] args) {
		
		ProgrammerProjectFactory factory=null;
		
		factory=new ProgrammerProjectFactory();
		
		ProgrammerProjectDAO dao=factory.getInstance();
		
		dao.saveData();

	}

}
