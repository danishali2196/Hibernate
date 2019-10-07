package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Student;
import com.nt.utility.HibernateUtil;

public class LoadObjectTest {

	public static void main(String[] args) {
		Session ses=null;	
		Student st=null;
		
		
			ses=HibernateUtil.getSession();
			
		st=ses.load(Student.class, 101);
		
			System.out.println(st.getSno()+"  "+st.getSname()+"   "+st.getCourse()+" "+st.getFee());			
	
		
		
		HibernateUtil.closeSession(ses);
		HibernateUtil.closeSessionFactory();
	}

}
