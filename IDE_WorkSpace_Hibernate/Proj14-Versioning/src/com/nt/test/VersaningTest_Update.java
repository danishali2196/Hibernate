package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.AirtelCallerTune;
import com.nt.utility.HibernateUtil;

public class VersaningTest_Update {

	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		int idVal=0;
		AirtelCallerTune act=null;
		boolean flag=false;
		
		ses=HibernateUtil.getSession();
		try {
			tx=ses.beginTransaction();
			 act=new AirtelCallerTune();
			 act=ses.get(AirtelCallerTune.class, 2);
			 
			act.setCustName("Danish ali");
			act.setMobile(958965L);
			act.setCallerTune("Allan Walker");
			
			System.out.println(idVal);
			flag=true;
			
		} catch (Exception e) {
			flag=false;
			e.printStackTrace();
		}
		finally {
			if (flag) {
				tx.commit();
				System.out.println("Record Inserted");
			}
			else {
				tx.rollback();
				System.out.println("Record not inserted");
			}
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
		
		
		
		
		
		

	}

}
