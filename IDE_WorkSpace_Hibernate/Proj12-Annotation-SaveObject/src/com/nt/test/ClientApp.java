package com.nt.test;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.EmpDetail;
import com.nt.utility.HibernateUtil;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		
		Session ses=null;
		EmpDetail ed=null;
		Transaction tx=null;
		int idVal=0; 
		boolean flag=false;
		
		ses=HibernateUtil.getSession();
		ed=new EmpDetail();
		ed.setEid(188);
		ed.setEname("yash");
		ed.setDesg("clerk");
		ed.setSalary(5000);
		
		try {
			tx=ses.beginTransaction();
			 ses.save(ed);
			flag=true;
			
		} catch (Exception e) {
				e.printStackTrace();
				flag=false;
		}
		finally {
			if(flag) {
				tx.commit();
				System.out.println("Record Inserted Seccesfully");
			}
			else {
				tx.rollback();
				System.out.println("Record Not Inserted");
			}
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
		
	}

}
