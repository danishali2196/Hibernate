package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.EmpDetail;
import com.nt.utility.HibernateUtil;

public class ClientApp_incrementGen1 {

	public static void main(String[] args) throws Exception {
		Session ses=null;
		ses=HibernateUtil.getSession();
		
		EmpDetail ed=null,ed1=null;
		Transaction tx=null;
		int idVal1=0,idVal2=0;
		boolean flag=false;
		
		ed=new EmpDetail();
		ed.setEid(102);
		ed.setEname("asif");
		ed.setDesg("clerk");
		ed.setSalary(8000);
		
		ed1=new EmpDetail();
		ed1.setEname("danish");
		ed1.setDesg("manager");
		ed1.setSalary(10000);
		
		
		try {
			tx=ses.beginTransaction();
			idVal1=(int) ses.save(ed);
			idVal2=(int) ses.save(ed1);
			System.out.println("Id value::"+idVal1+"   "+idVal2);
			flag=true;
			
		} catch (Exception e) {
			flag=false;
			tx.rollback();
	
		}
		finally {
			if (flag) {
				tx.commit();
				System.out.println("Record Inserted Seccesfully");
			}
			else {
				tx.rollback();
				System.out.println("Record is not inserted");
			}
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
		
		
		
	}

}
