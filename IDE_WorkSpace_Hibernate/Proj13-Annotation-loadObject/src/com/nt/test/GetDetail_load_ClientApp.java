package com.nt.test;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.EmpDetail;
import com.nt.entity.IEmp;
import com.nt.utility.HibernateUtil;

public class GetDetail_load_ClientApp {

	public static void main(String[] args) throws Exception {
		
		Session ses=null;
		//EmpDetail ed=null;
		
		
		ses=HibernateUtil.getSession();
		
		IEmp ed=ses.load(EmpDetail.class, 102);
	
			//System.out.println(ed.getEid()+" "+ed.getEname()+" "+ed.getDesg()+"  "+ed.getSalary());
		
	
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();	
	}

}
