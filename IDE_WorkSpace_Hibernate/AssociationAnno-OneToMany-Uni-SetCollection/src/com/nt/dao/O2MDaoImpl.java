package com.nt.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

		Set<Customer> chield=new HashSet();
		chield.add(cust1);
		chield.add(cust2);
		
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
	
	@Override
	public void loadData() {

		Session ses =null;
		Bank bank=null;
		Query query=null;
		List<Bank> list=null;
		
		ses=HibernateUtil.getSession();
		query=ses.createQuery("from Bank");
		list=query.getResultList();
		
		list.forEach(ban->{
			System.out.println(ban);
			Set<Customer> cust=ban.getAccHolder();
			System.out.println(cust);
		});
		
	}

}
