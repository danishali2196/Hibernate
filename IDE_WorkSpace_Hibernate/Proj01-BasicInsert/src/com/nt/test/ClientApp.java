package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.EmpDetail;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		Configuration cfg=new Configuration();
		
		cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session ses=factory.openSession();
		
		EmpDetail ed=new EmpDetail();
		ed.setEid(102);
		ed.setEname("asif");
		ed.setDesg("clerk");
		ed.setSalary(8000);
		
		Transaction tx=null;
		try {
			tx=ses.beginTransaction();
			ses.save(ed);
			tx.commit();
			System.out.println("Record Inserted Seccesfully");
		} catch (Exception e) {
			tx.rollback();
	
		}
		
		ses.close();
		factory.close();
		
	}

}
