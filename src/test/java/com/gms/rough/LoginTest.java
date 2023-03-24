package com.gms.rough;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.gms.base.Page;
import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.LoginPage;
import com.gms.pages.actions.ManagePurchasesPage;
import com.gms.utilities.Utilities;

public class LoginTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data) throws InterruptedException {

		
		 if (data.get("runmode").equalsIgnoreCase("N")) {
		 
		 throw new SkipException("Skipping the test as the Run mode is NO");
		 
		 }
		 
		Page.initConfiguration();
		LoginPage login = new LoginPage();
		login.doLogin(data.get("username"), data.get("password"));
		HomePage home = new HomePage();
		home.clickMenuTab();
		home.clickIMmenu();
		ManagePurchasesPage manPur = new ManagePurchasesPage();
		manPur.clickManagePurBtn();
		manPur.clickDetailedBtn();
//		manPur.clickStandardBtn();
		manPur.submitInvDetails(data.get("invNO"), data.get("invDate"), data.get("vendorName"), data.get("taxType"), data.get("taxSub"), data.get("discType"), data.get("profType"));
		manPur.clickByVehicle();
		manPur.selVehBrand();
		
		
	}

}
