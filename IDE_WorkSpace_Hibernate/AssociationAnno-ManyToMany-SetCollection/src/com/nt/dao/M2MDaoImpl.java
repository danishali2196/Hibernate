package com.nt.dao;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Doctor;
import com.nt.entity.Patient;
import com.nt.utility.HibernateUtil;

public class M2MDaoImpl implements M2MDao {

	@Override
	public void saveData() {
		Session ses=null;
		Doctor doc1=null,doc2=null;
		Patient pat1=null,pat2=null;
		Transaction tx=null;
		boolean flag=false;
		//get Session
		ses=HibernateUtil.getSession();
		
		//get entity class object
		doc1=new Doctor();
//		doc1.setDid(15426);
		doc1.setDname("danish");
		doc1.setSpecialization("cardio");
		
		doc2=new Doctor();
		doc2.setDname("yash");
		doc2.setSpecialization("dental");

		pat1=new Patient();
//		pat1.setPid(10054);
		pat1.setPname("vineet");
		pat1.setDeasise("mental");

		pat2=new Patient();
		pat2.setPname("rohit");
		pat2.setDeasise("hairFall");
		
		
//		doc1.getPatients().add(pat1);
//		doc1.getPatients().add(pat2);
//		doc2.getPatients().add(pat2);
		
		
		pat1.getDoctors().add(doc2);
		pat1.getDoctors().add(doc1);
		pat2.getDoctors().add(doc1);
		
	
		try {
			tx=ses.beginTransaction();
			ses.save(pat1);
			ses.save(pat2);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
			flag=false;
		}
		finally {
			if (flag) {
				tx.commit();
				System.out.println("record saved");
			}
			else {
				tx.rollback();
				System.out.println("record not saved");
			}
			HibernateUtil.closeSession(ses);
		}
	}
	

}
