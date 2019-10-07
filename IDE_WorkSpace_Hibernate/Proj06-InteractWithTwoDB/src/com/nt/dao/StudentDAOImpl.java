package com.nt.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Student;
import com.nt.utility.MySqlHibernateUtil;
import com.nt.utility.OracleHibernateUtil;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public boolean transfer(int sno) {
		Session mysqlSes=null,oracleSes=null;
		boolean oraflag=false,resultflag=false;
		Transaction oratx=null;
		Student stud=null;
		
		//get session 
	oracleSes=OracleHibernateUtil.getSession();
	mysqlSes=MySqlHibernateUtil.getSession();
	
		//get object from mysql
	stud=mysqlSes.get(Student.class, sno);
	System.out.println(stud);
	//store object into oracle
	try {
		oratx=oracleSes.beginTransaction();
		//stud.setCourse("java");
		oracleSes.save(stud);
		oraflag=true;
		
	} catch (Exception e) {
		oraflag=false;
		e.printStackTrace();
	}
		finally {
			if (oraflag) {
				oratx.commit();
				System.out.println("record transfer");
				resultflag=true;
				
			}
			else {
				oratx.rollback();
				System.out.println("record not transfer");
				resultflag=false;
			}
			OracleHibernateUtil.closeSession(oracleSes);
			MySqlHibernateUtil.closeSession(mysqlSes);
			
		}
	return resultflag;
	
	}



}
