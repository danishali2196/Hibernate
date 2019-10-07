package com.nt.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Programmer;
import com.nt.entity.Project;
import com.nt.utility.HibernateUtil;

public class M2MDAOImpl implements M2MDAO {
	public M2MDAOImpl() {
		System.out.println("M2MDAOImpl.M2MDAOImpl()");
	}

	@Override
	public void saveData() {
		Session ses=null;
		Project proj1=null,proj2=null;
		Programmer p1=null,p2=null,p3=null;
		Transaction tx=null;
		boolean flag=false;
		
		ses=HibernateUtil.getSession();
		//get entity class obj
		proj1=new Project();
		proj1.setProjName("uhg");
		proj1.setDomain("hc");
		
		proj2=new Project();
		proj2.setProjName("CityBank");
		proj2.setDomain("fs");
		
		p1=new Programmer();
		p1.setpId(1);
		p1.setpName("danish");
		p1.setSalary(60000);
		
		p2=new Programmer();
		p2.setpId(2);
		p2.setpName("asif");
		p2.setSalary(6000);
		
		p3=new Programmer();
		p3.setpId(3);
		p3.setpName("sohail");
		p3.setSalary(8000);
		
		//set project to programmer
//		p1.getProjects().add(proj1);
//		p1.getProjects().add(proj2);
//		p2.getProjects().add(proj1);
//		p3.getProjects().add(proj1);
//		p3.getProjects().add(proj2);
		
		//set
		proj1.getProgrammers().add(p1);
		proj2.getProgrammers().add(p2);
		proj2.getProgrammers().add(p3);
		
		try{
			//begin transaction
			tx=ses.beginTransaction();
			ses.save(proj1);
			ses.save(proj2);

			flag=true;
		
			
		}//try
		catch (Exception e) {
			flag = false;
			e.printStackTrace();
		}
		finally {
			
			if (flag) {
				tx.commit();
				System.out.println("Object saved");
			}
			else {
				tx.rollback();
				System.out.println("Object are not saved");
			}
			HibernateUtil.closeSession(ses);
		}

	}//methos

}//class
