package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Student;
import com.nt.utility.HibernateUtil;

public class UpdateRecord_Approch2 {

	public static void main(String[] args) {
		
		Session ses=null;
		Student st=null;
		Transaction tx=null;
		boolean flag = false;
		//get Sesson
		ses=HibernateUtil.getSession();
		st=ses.load(Student.class, 108);
		if(st == null) {
			System.out.println("Record not found");
		}
		else {
			try {
				tx=ses.beginTransaction();
				st.setFee(2000);
				ses.update(st);
				flag = true;
			} catch (Exception e) {
				flag = false;
				// TODO: handle exception
			}
			finally {
				if (flag) {
					tx.commit();
					System.out.println("Record update");
				}
				else {
					tx.rollback();
					System.out.println("Record not update");
				}
				
			}
		}
		
		

	}

}
