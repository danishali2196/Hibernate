package com.nt.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.ProgrammerProjectID;
import com.nt.entity.ProgrammerProjectInfo;
import com.nt.utility.HibernateUtil;

public class ProgrammerProjectImpl implements ProgrammerProjectDAO{

	@Override
	public void saveData() {
		System.out.println("ProgrammerProjectImpl.saveData()");
		 Session ses=null;
		 ProgrammerProjectID id=null,idVal=null;
		 ProgrammerProjectInfo info=null;
		 Transaction tx=null;
		 boolean flag=false;
		 
		 ses=HibernateUtil.getSession();
		 
		 id=new ProgrammerProjectID();
		 id.setPrgmrId(103); id.setProjId(1002);
		 
		 info=new ProgrammerProjectInfo();
		 info.setId(id);
		 info.setPrgmrName("Danish");
		 info.setSalary(100000);
		 info.setProjName("Proj1");
		
		 try {
			 tx=ses.beginTransaction();
			 idVal=(ProgrammerProjectID) ses.save(info);
					 System.out.println("Id value::"+idVal);
			 flag=true;
			
		} catch (Exception e) {
			flag=false;
			e.printStackTrace();
		}
		 finally {
			 if (flag) {
				tx.commit();
				System.out.println("Record is Saved");
			}else {
				tx.rollback();
				System.out.println("record not saved");
			}
			 HibernateUtil.closeSession(ses);
		 }

	}

}
