package com.gms.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.gms.pages.actions.CustRegPage;
import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.ManagePurchasesPage;
import com.gms.pages.actions.NewCustReg;
import com.gms.utilities.Utilities;

public class CustRegTest {
	
	
		
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void custRegTest(Hashtable<String,String> data) throws InterruptedException {
		
		HomePage home = new HomePage();
		home.clickNewCustRegTab();
		/*
		 * CustRegPage custReg = new CustRegPage(); custReg.custReg(data.get("vehNo"),
		 * data.get("vehName"), data.get("vehCat"), data.get("kmDriven"),
		 * data.get("custName"), data.get("emailId"), data.get("monNum"),
		 * data.get("custAddr"), data.get("technician"));
		 */
		NewCustReg newCust = new NewCustReg();
		newCust.custReg(data.get("vehNo"), data.get("vehName"), data.get("vehCat"), data.get("kmDriven"), data.get("custName"), data.get("emailId"), data.get("mobNum"), data.get("custAddr"), data.get("technician"));
		
	}
	
}
