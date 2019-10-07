package com.nt.proxy;

import com.nt.entity.BankService;
import com.nt.entity.BankServiceImpl;

public class ProxyBankService implements BankService {
	private BankService service=null;
	
	public ProxyBankService() {
		System.out.println("ProxyBankService:0-param constructor");
		service = new BankServiceImpl();
	}
	@Override
	public String withDraw(int accNo, float amt) {
		System.out.println("ProxyBankService.withDraw(-,-)");
		String result=null;
		if(amt <= 200000) {
			result = service.withDraw(accNo, amt);
		}
		else {
			throw new IllegalArgumentException("Amount more then 200000 take permission from RBI");
		}
		
		return result;
	}

}
