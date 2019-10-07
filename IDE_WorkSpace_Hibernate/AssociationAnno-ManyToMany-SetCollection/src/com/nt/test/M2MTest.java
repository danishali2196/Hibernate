package com.nt.test;

import com.nt.dao.M2MDao;
import com.nt.dao.M2MDaoFactory;
import com.nt.utility.HibernateUtil;

public class M2MTest {

	public static void main(String[] args) {
		M2MDao dao=null;
		//get DAo
		dao=M2MDaoFactory.getInstance();
		
		//invoke method
		dao.saveData();
		
		HibernateUtil.closeSessionFactory();
		

	}

}
