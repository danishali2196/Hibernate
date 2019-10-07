package com.nt.dao;

public class AirtelCallerTuneFactory {
	
	public static InterfaceAirtelCallerTune getInstence() {
	
		System.out.println("AirtelCallerTuneFactory.getInstence()");
				return new AirtelCallerTuneImpl();
	}

}
