package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Student;
import com.nt.utility.HibernateUtil;

public class GetObjectTest {

	public static void main(String[] args) {
		Session ses=null;	
		Student st=null;
		
		
		
			ses=HibernateUtil.getSession();
			
		st=ses.get(Student.class, 109);
		if(st!=null) {
			System.out.println(st.getSno()+"  "+st.getSname()+"   "+st.getCourse()+" "+st.getFee());			
		}
		else {
			System.out.println("Recor not found");
		}
		
		
		HibernateUtil.closeSession(ses);
		HibernateUtil.closeSessionFactory();
	}

}
