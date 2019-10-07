package com.nt.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.nt.entity.Bank;
import com.nt.entity.Customer;
import com.nt.utility.HibernateUtil;

public class O2MDaoImpl implements O2MDao {

	@Override
	public void saveData() {
		Session ses=null;
		Bank bank=null;
		Customer cust1=null, cust2=null;
		Transaction tx=null;
		boolean flag=false;
		
		//get session
		ses=HibernateUtil.getSession();
		//get entity class Object
		bank=new  Bank();
		bank.setBankId(2001);
		bank.setBankName("CBI");
		bank.setLocation("hyd");
		
		cust1=new Customer();
		cust1.setBalace(5000);
		cust1.setHName("raja");
		
		cust2=new Customer();
		cust2.setBalace(3000);
		cust2.setHName("ysh");

		Map<String,Customer> chield=new HashMap();
		chield.put("seving",cust1);
		chield.put("current",cust2);
		
		bank.setAccHolder(chield);
		
		try {
			tx=ses.beginTransaction();
			ses.save(bank);
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
				System.out.println("records not saved");
			}
			HibernateUtil.closeSession(ses);
		}
	}//method
	


}
