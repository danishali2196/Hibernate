package com.nt.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.nt.entity.Employee;
import com.nt.utility.HibernateUtil;

public class ClientTest {
	private static final String GET_ALL_EMPLOYEE="SELECT EID,ENAME,DESG,SALARY FROM EMPLOYEE";
	
	public static void main(String[] args) {
		Session ses=null;
		List<Employee> list=null;
		Query query=null;
		
		ses=HibernateUtil.getSession();
		
		query=ses.createQuery(GET_ALL_EMPLOYEE, Employee.class);
		list=query.getResultList();
		list.forEach(emp->{
			System.out.println(emp);
		});
		
		
		
	}
	

}
