package com.nt.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	
	private static SessionFactory factory=null;
	private static ThreadLocal<Session> threadlocal=new ThreadLocal<Session>();
	static {
		System.out.println("HibernateUtil::static block");
		//bootStrap hibernate
		 Configuration  cfg=new Configuration();
		cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
		//build SessionFactory
		factory=cfg.buildSessionFactory();
	}//static
	
	public static Session getSession() {
		Session ses=null;
		if (factory != null) {
			if (threadlocal.get()==null) {
				ses=factory.openSession();
				threadlocal.set(ses);
				return ses;
			}//innerIf
			else {
				ses=threadlocal.get();
				return ses;
			}//else
		}//if
		return ses;
	}//get Session
	
	public static void closeSession() {
		Session ses=null;
		if (threadlocal.get()!=null) {
			ses=threadlocal.get();
			ses.close();
			threadlocal.remove();
		}
	}//close session
	
	public static void closeSessionFactory() {
		if (factory!=null) {
			factory.close();
			
		}
	}//close session factory
}
