package com.nt.test;

import com.nt.dao.AirtelCallerTuneFactory;
import com.nt.dao.InterfaceAirtelCallerTune;

public class VersioningTest_FactoryDP {

	public static void main(String[] args) {
		
		AirtelCallerTuneFactory acf=null;
		acf=new AirtelCallerTuneFactory();
		
		InterfaceAirtelCallerTune iact=acf.getInstence();
		//iact.insertDetail();
		iact.modifyDetails();
		

	}

}
