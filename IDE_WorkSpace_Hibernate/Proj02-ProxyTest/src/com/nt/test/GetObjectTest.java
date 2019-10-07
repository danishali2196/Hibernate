package com.nt.test;

import org.hibernate.Session;

import com.nt.entity.InsurancePolicyImpl;
import com.nt.utility.CommanUtil;

public class GetObjectTest {

	public static void main(String[] args) {
		
		Session ses=null;
		InsurancePolicyImpl policy=null;		
			//create session
				ses=CommanUtil.getSession();
		//load object using ses.get(-,-)
				try {
					policy=ses.get(InsurancePolicyImpl.class, 102);
							if(policy != null) {
								System.out.println(policy.getPolicyID()+" "+policy.getPolicyName()+"  "+policy.getTenure()+"  "+policy.getCompany()+"  "+policy.getInitialAmount());
							}
							else {
								System.out.println("Record/Object not found");
							}
				} catch (Exception e) {
					e.printStackTrace();
				}
				finally {
					CommanUtil.closeSession(ses);
					CommanUtil.closeSessionFactory();
				}
	}

}
