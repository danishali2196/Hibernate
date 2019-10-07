package com.nt.entity;

public class BankServiceImpl implements BankService {
	
	public BankServiceImpl() {
		System.out.println("BankServiceImpl:0-param constructor");
	}
	
	@Override
	public String withDraw(int accNo, float amt) {
		System.out.println("BankServiceImpl.withDraw(-,-)");
		return "Withdraw Amount "+amt+" from Account No "+accNo;
	}

}
