package com.nt.test;

import com.nt.entity.BankService;
import com.nt.factory.BankServiceFactory;

public class ProxyDPTest {

	public static void main(String[] args) {
		BankService service=null;
		try {
		service=BankServiceFactory.getInstance(true);
		System.out.println("service obj class name::"+service.getClass());
		System.out.println(service.withDraw(1001,300000));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("=====================");
		try {
			service=BankServiceFactory.getInstance(true);
			System.out.println("service obj class name::"+service.getClass());
			System.out.println(service.withDraw(1001,100000));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("=====================");
		try {
			service=BankServiceFactory.getInstance(false);
			System.out.println("service obj class name::"+service.getClass());
			System.out.println(service.withDraw(1001,100000));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("=====================");
		try {
			service=BankServiceFactory.getInstance(false);
			System.out.println("service obj class name::"+service.getClass());
			System.out.println(service.withDraw(1001,2000000));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		
		

	}

}

