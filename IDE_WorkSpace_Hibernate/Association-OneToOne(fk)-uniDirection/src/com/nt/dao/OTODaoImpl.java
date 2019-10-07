package com.nt.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.nt.entity.Passport;
import com.nt.entity.Person;
import com.nt.utility.HibernateUtil;

import oracle.net.aso.p;

public class OTODaoImpl implements OTODAO {

	@Override
	public void saveData() {
		Session ses=null;
		Person per1=null,per2=null;
		Passport pspt=null;
		Transaction tx=null;
		boolean flag=false;
		
		//get hibernet session
		ses=HibernateUtil.getSession();

		//get Entity Class Obj
		per1=new Person();
		per1.setPname("Danish");
		per1.setAge((byte)23);
		
		per2=new Person();
		per2.setPname("yash");
		per2.setAge((byte)25);
	
		pspt=new Passport();
		pspt.setCountry("india");
		pspt.setValidFrom(new Date(110,10,10));
		pspt.setValidTo(new Date(120,10,10));
		pspt.setPassportHolder(per1);
		
		try {
			
			tx=ses.beginTransaction();
			ses.save(pspt);
			ses.save(per2);
			
			flag=true;
		} catch (Exception e) {
			flag=false;
			e.printStackTrace();
		}
		finally {
			if (flag) {
				tx.commit();
				System.out.println("Information is saved");
			}
			else {
				tx.rollback();
				System.out.println("Information is not Saved");
			}
			HibernateUtil.closeSession(ses);
		}//finally
	}//method

	@Override
	public void fetchData() {
		Session ses=null;
		ses=HibernateUtil.getSession();
		Query query=ses.createQuery("from Passport");
		List<Passport> list=null;
		
			list=query.getResultList();
			list.forEach(p->{
				System.out.println("child::"+p);
				Person per=p.getPassportHolder();
				System.out.println("parent::"+per);
			});
		
	
		HibernateUtil.closeSession(ses);
		
	}
}
