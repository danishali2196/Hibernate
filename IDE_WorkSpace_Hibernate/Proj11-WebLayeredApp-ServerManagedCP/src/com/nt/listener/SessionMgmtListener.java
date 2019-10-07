package com.nt.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

import org.hibernate.search.cfg.impl.HibernateCoreIdUniquenessResolver;

import com.nt.utility.HibernateUtil;

public class SessionMgmtListener implements ServletRequestListener{
	public SessionMgmtListener() {
		System.out.println("SessionMgmtListener.SessionMgmtListener()");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("SessionMgmtListener.requestDestroyed()");
		HibernateUtil.closeSession();
		
	}
	
	
	

}
