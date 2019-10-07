package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Student;
import com.nt.utility.HibernateUtil;

public class Deleted_UsingApp1 {

	public static void main(String[] args) {
		
		Session ses=null;
		Student st=null;
		Transaction tx=null;
		boolean flag=false;
		
		//get Session Object
		ses=HibernateUtil.getSession();
		//get class obj
		st=new Student();
		st.setSno(102);
		
		try {
			tx=ses.beginTransaction();
			ses.delete(st);
			flag= true;
			
		} catch (Exception e) {
			flag=false;
			e.printStackTrace();
		}
		finally {
			if(flag) {
				tx.commit();
				System.out.println("Record Deleted");
			}
			else {
				tx.rollback();
				System.out.println("Record not deleted");
			}
			
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
	}

}
