package com.nt.test;

import com.nt.dao.M2MDAO;
import com.nt.dao.M2MDAOFactory;
import com.nt.utility.HibernateUtil;

public class M2MTEST {

	public static void main(String[] args) {
		M2MDAO dao=null;
		//get dao class object
		dao=M2MDAOFactory.getInstance();
		
		dao.saveData();

		HibernateUtil.closeSessionFactory();
	}

}
