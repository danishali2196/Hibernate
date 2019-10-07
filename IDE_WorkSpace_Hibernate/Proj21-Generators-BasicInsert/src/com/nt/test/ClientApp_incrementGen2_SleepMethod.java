package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.EmpDetail;
import com.nt.utility.HibernateUtil;

public class ClientApp_incrementGen2_SleepMethod {

	public static void main(String[] args) throws Exception {
		Session ses=null;
		Transaction tx=null;
		EmpDetail ed=null;
		boolean flag=false;
		ses=HibernateUtil.getSession();
		
		ed=new EmpDetail();
		ed.setEid(102);
		ed.setEname("asif");
		ed.setDesg("clerk");
		ed.setSalary(8000);
	
		
		try {
			tx=ses.beginTransaction();
			ses.save(ed);
			flag=true;
			System.out.println("thread going to sleep");
			Thread.sleep(30000);
					
		} catch (Exception e) {
			flag=false;
	
		}
		finally {
			if (flag) {
				tx.commit();
				System.out.println("Record Inserted Seccesfully");
			}
			else {
				tx.rollback();
				System.out.println("Record  not  Inserted");
			}
			
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
		
		
	}

}
