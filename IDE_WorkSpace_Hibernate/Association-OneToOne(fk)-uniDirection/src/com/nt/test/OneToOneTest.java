package com.nt.test;

import com.nt.dao.OTODAO;
import com.nt.dao.OTODaoFactory;
import com.nt.utility.HibernateUtil;

public class OneToOneTest {

	public static void main(String[] args) {
		OTODAO dao=null;
		dao=OTODaoFactory.getInstance();
		//dao.saveData();
		dao.fetchData();
		
		HibernateUtil.closeSessionFactory();
		

	}

}
