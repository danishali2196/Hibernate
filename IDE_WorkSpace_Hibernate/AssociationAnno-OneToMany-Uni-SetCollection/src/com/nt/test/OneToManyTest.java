package com.nt.test;

import com.nt.dao.O2MDao;
import com.nt.dao.O2MDaoFactory;
import com.nt.utility.HibernateUtil;

public class OneToManyTest {
	
	public static void main(String[] args) {
		
		O2MDao dao=null;
		
		dao=O2MDaoFactory.getInstance();
		
		//dao.saveData();
		dao.loadData();
		
		HibernateUtil.closeSessionFactory();
	}
	
	


}
