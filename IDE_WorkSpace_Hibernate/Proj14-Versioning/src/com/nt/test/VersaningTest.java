package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.AirtelCallerTune;
import com.nt.utility.HibernateUtil;

public class VersaningTest {

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
			act.setCustName("Danish");
			act.setMobile(9589658478L);
			act.setCallerTune("Megenta");
			idVal=(int) ses.save(act);
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
