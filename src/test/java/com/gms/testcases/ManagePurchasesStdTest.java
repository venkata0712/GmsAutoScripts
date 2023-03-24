package com.gms.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.ManagePurchasesPage;
import com.gms.utilities.Utilities;

public class ManagePurchasesStdTest {

	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void managePurchasesStdTest(Hashtable<String, String> data) throws InterruptedException {

		HomePage home = new HomePage();
		home.clickMenuTab();
		home.clickIMmenu();
		ManagePurchasesPage manPur = new ManagePurchasesPage();
		manPur.clickManagePurBtn();
		manPur.clickStandardBtn();
		manPur.submitInvDetails(data.get("invNo"), data.get("invDate"), data.get("vendorName"), data.get("taxType"),
				data.get("taxSub"), data.get("discType"), data.get("profType"));

	}
}
