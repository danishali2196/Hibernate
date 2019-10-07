package com.nt.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Department;
import com.nt.entity.Employee;
import com.nt.utility.HibernateUtil;

public class M2ODaoImpl implements M2ODao {

	@Override
	public void saveData() {
		Session ses=null;
		Employee emp1=null,emp2=null;
		Department dept=null;
		Transaction tx=null;
		boolean flag=false;
		//get session obj
		ses=HibernateUtil.getSession();
		
		//get entity class object
		emp1=new Employee();
		emp1.setEname("Danish");
		emp1.setSal(8000);
		
		emp2=new Employee();
		emp2.setEname("Yash");
		emp2.setSal(4000);
		
		dept=new Department();
		dept.setDeptNo(1001);
		dept.setDeptName("IT");
		dept.setDeptHead("Smith");

		//save parent using child
		emp1.setDept(dept);
		emp2.setDept(dept);
		
		try {
			tx=ses.beginTransaction();
			ses.save(emp1);
			ses.save(emp2);
			flag=true;
		}//try
		catch (Exception e) {
			e.printStackTrace();
			flag=false;
		}
		finally {
			if (flag) {
				tx.commit();
				System.out.println("Records are saved");
			}
			else {
				tx.rollback();
				System.out.println("Records are not saved");
			}
			HibernateUtil.closeSession(ses);
		}//finally
	}//method

}//class
