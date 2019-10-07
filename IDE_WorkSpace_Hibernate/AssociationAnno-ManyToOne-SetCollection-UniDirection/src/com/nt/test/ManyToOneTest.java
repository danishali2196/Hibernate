package com.nt.test;

import com.nt.dao.M2ODao;
import com.nt.dao.M2ODaoFactory;
import com.nt.utility.HibernateUtil;

public class ManyToOneTest {

	public static void main(String[] args) {
		
		M2ODao dao=null;
		//get dao 
		dao=M2ODaoFactory.getInstance();
		//invoke method
		dao.saveData();
		
		HibernateUtil.closeSessionFactory();

	}

}
