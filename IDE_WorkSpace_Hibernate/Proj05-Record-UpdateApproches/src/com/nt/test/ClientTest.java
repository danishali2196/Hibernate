package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Student;
import com.nt.utility.HibernateUtil;

public class ClientTest {

	public static void main(String[] args) {
		Session ses=null;	
		Student st=null;
		Transaction tx=null;
		boolean flag = false;
		int idVal=0;
		
			ses=HibernateUtil.getSession();
			
		st=new Student();
			st.setSno(102);st.setSname("nt"); st.setCourse("java"); st.setFee(1000);
			
			try {
				tx=ses.beginTransaction();
				idVal=(Integer)ses.save(st);
				
				flag = true;
			
			
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		}
			finally {
				if (flag) {
					tx.commit();
					System.out.println("record inserted");
				}
				else {
					tx.rollback();
					System.out.println("record not inserted");
				}
				HibernateUtil.closeSession(ses);
				HibernateUtil.closeSessionFactory();
			}

	}

}
