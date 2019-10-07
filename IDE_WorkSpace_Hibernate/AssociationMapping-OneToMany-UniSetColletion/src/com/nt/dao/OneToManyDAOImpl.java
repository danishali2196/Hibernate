package com.nt.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.PhoneNumber;
import com.nt.entity.User;
import com.nt.utility.HibernateUtil;

public class OneToManyDAOImpl implements OneToManyDAO {

	public OneToManyDAOImpl() {
		System.out.println("OneToManyDAOImpl.OneToManyDAOImpl()");
	}
	@Override
	public void saveData() {
		Session ses=null;
		User user=null;
		PhoneNumber ph1=null;
		PhoneNumber ph2=null;
		Transaction tx=null;
		Boolean flag=false;
		
		//create session obj 
		ses=HibernateUtil.getSession();
		//get entity class obj
		user=new User();
		user.setUserName("Danish");
		
		ph1=new PhoneNumber();
		ph1.setPhone(9589619147L);
		ph1.setPhoneType("Office");
		ph1.setProvider("Airtel");
		
		ph2=new PhoneNumber();
		ph2.setPhone(9553645660L);
		ph2.setPhoneType("Family");
		ph2.setProvider("Idea");
		
		Set<PhoneNumber> set=new HashSet();
		set.add(ph1); set.add(ph2);
		
		user.setPhones(set);

		try {
			tx=ses.beginTransaction();
			ses.save(user);
			flag=true;
			
		} catch (Exception e) {
			flag=false;
			e.printStackTrace();
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
		}
	}
	@Override
	public void addNewPhoneNumberExistingUser() {
		Session ses=null;
		User user=null;
		PhoneNumber ph1=null;
		Transaction tx=null;
		Boolean flag=false;
		
		//create session obj 
		ses=HibernateUtil.getSession();
		//get entity class obj
		user=ses.get(User.class, 1);
		
		
		ph1=new PhoneNumber();
		ph1.setPhone(7509660627L);
		ph1.setPhoneType("Night");
		ph1.setProvider("Airtel");

		
		Set<PhoneNumber> set=user.getPhones();
		set.add(ph1); 
		
		user.setPhones(set);

		try {
			tx=ses.beginTransaction();
			ses.save(user);
			flag=true;
			
		} catch (Exception e) {
			flag=false;
			e.printStackTrace();
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
		}
		
	}
	@Override
	public User loadData() {
		Session ses=null;
		User user=null;
		PhoneNumber ph=null;
		//get session obj
		ses=HibernateUtil.getSession();
		
		user = new User();
		user.getUserId();
		user.getUserName();
		user.getPhones();
		
		ph=new PhoneNumber();
		ph.getPhone();
		ph.getPhoneType();
		ph.getProvider();
		
		Set<PhoneNumber> set=new HashSet();
		set.add(ph);
		return null;
	}

}
