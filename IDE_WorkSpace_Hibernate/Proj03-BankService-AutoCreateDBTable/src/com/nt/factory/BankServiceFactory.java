package com.nt.factory;

import com.nt.entity.BankService;
import com.nt.entity.BankServiceImpl;
import com.nt.helper.BSProxyHelper;

import net.sf.cglib.proxy.Enhancer;

public class BankServiceFactory {
	
	public static BankService getInstance(boolean RBIMonitering) {
		BankService service = null;
		if (RBIMonitering) {
			service = (BankService) Enhancer.create(BankServiceImpl.class,new BSProxyHelper());
		}
		else
			service = new BankServiceImpl();
		return service;
	}

}
