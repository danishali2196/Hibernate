package com.nt.dao;

import org.hibernate.Session;

import com.nt.entity.LibraryMembership;
import com.nt.entity.Student;
import com.nt.utility.HibernateUtil;

public class CollegeDAOImpl implements CollegeDAO{

	@Override
	public int saveData(Student stud) throws Exception {
		Session ses=null;
		LibraryMembership lib=null;
		
		//get Session 
		ses=HibernateUtil.getSession();
		
		
		
		return 0;
	}
	
	
	

}
