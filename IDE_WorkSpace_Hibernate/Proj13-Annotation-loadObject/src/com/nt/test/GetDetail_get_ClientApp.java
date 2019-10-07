package com.nt.test;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.EmpDetail;
import com.nt.utility.HibernateUtil;

public class GetDetail_get_ClientApp {

	public static void main(String[] args) throws Exception {
		
		Session ses=null;
		EmpDetail ed=null;
	

		
		ses=HibernateUtil.getSession();
		
		ed=ses.get(EmpDetail.class, 102);
		if(ed!=null) {
			System.out.println(ed.getEid()+" "+ed.getEname()+" "+ed.getDesg()+"  "+ed.getSalary());
		}
		else {
			System.out.println("Record not found");
		}
			
		
	
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		
		
	}

}
