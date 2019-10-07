package com.nt.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.AirtelCallerTune;
import com.nt.utility.HibernateUtil;

public class AirtelCallerTuneImpl implements InterfaceAirtelCallerTune {

	static {
		System.out.println("AirtelCallerTuneImpl()");
	
	}

	@Override
	public void insertDetail() {
		System.out.println("AirtelCallerTuneImpl.insertDetail()");
		Session ses=null;
		Transaction tx=null;
		int idVal=0;
		AirtelCallerTune act=null;
		boolean flag=false;
		
		ses=HibernateUtil.getSession();
		try {
			tx=ses.beginTransaction();
			 act=new AirtelCallerTune();
			act.setCustname("Danish");
			act.setMobile(9589658478L);
			act.setCallertune("Megenta");
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
		
	}//insert details
	
	public void modifyDetails() {
		Session ses=null;
		Transaction tx=null;
		int idVal=0;
		AirtelCallerTune act=null;
		boolean flag=false;
		
		ses=HibernateUtil.getSession();
		try {
			tx=ses.beginTransaction();
			 act=new AirtelCallerTune();
			 act=ses.get(AirtelCallerTune.class, 1);
			 
			act.setCustname("Danish ");
			act.setMobile(958L);
			act.setCallertune("Allan Walker");
			
			System.out.println(idVal);
			flag=true;
			
		} catch (Exception e) {
			flag=false;
			e.printStackTrace();
		}
		finally {
			if (flag) {
				tx.commit();
				System.out.println("Record Modified");
			}
			else {
				tx.rollback();
				System.out.println("Record not Modified");
			}
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
		
		
		
	}
	

}
