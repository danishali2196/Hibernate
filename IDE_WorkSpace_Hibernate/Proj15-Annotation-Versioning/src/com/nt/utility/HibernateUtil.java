package com.nt.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static SessionFactory factory=null;
	static {
		try {
			Configuration conf=new Configuration();
			conf.configure("/com/nt/cfgs/hibernate.cfg.xml");
			
			factory=conf.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Session getSession() {
	Session ses=null;
		if(factory!=null) {
			ses=factory.openSession();
		}
		return ses;
	}
	
	public static void closeSession(Session ses) {
		if (ses!=null) {
			ses.close();
		}
	}
	
	public static void closeSessionFactory() {
		if (factory!=null) {
			factory.close();
			
		}
	}
}
