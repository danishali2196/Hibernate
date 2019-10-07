package com.nt.test;

import com.nt.dao.OneToManyDAO;
import com.nt.dao.OneToManyDAOFactory;
import com.nt.utility.HibernateUtil;

public class OneToManyDAOTest {
	
	public static void main(String[] args) {
		
		OneToManyDAO dao=OneToManyDAOFactory.getInstance();
		//invoke method
		//dao.saveData();
		dao.addNewPhoneNumberExistingUser();
		
		HibernateUtil.closeSessionFactory();
		
		
		
	}

}
