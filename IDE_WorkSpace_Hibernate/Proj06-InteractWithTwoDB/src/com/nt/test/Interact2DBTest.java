package com.nt.test;

import org.omg.CORBA.portable.ApplicationException;

import com.nt.dao.StudentDAO;
import com.nt.dao.StudentDAOFactory;
import com.nt.dao.StudentDAOImpl;
import com.nt.entity.Student;
import com.nt.utility.MySqlHibernateUtil;
import com.nt.utility.OracleHibernateUtil;

public class Interact2DBTest {

	public static void main(String[] args) {
		StudentDAO st=null;
		
		st=new StudentDAOFactory().getInstance();
		System.out.println(st.transfer(103));
				
		OracleHibernateUtil.closeSessionFactory();
		MySqlHibernateUtil.closeSessionFactory();

	}

}
