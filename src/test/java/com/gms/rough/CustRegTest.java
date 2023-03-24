package com.gms.rough;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.gms.base.Page;
import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.LoginPage;
import com.gms.pages.actions.NewCustReg;
import com.gms.utilities.Utilities;

public class CustRegTest extends Page  {
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void custRegTest(Hashtable<String,String> data) throws InterruptedException {
		
		Page.initConfiguration();
		LoginPage login = new LoginPage();
		login.doLogin(data.get("username"), data.get("password"));
	
		HomePage home = new HomePage();
		home.clickNewCustRegTab();
		NewCustReg newCust = new NewCustReg();
		newCust.custReg(data.get("vehNo"), data.get("vehName"), data.get("vehCat"), data.get("kmDriven"), data.get("custName"), data.get("emailId"), data.get("mobNum"), data.get("custAddr"), data.get("technician"));
		// for Tesing
	}
	
	
	
}
