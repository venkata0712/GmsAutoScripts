package com.gms.pages.actions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.gms.base.Page;
import com.gms.pages.locators.CustRegLocators;
import com.gms.pages.locators.HomePageLocators;

public class NewCustReg extends Page {

	public CustRegLocators custReg;
	public HomePageLocators home;

	public NewCustReg() {

		this.custReg = new CustRegLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.custReg);
	}

	public void clickNewCustRegTab() {

		click(home.newCustRegTab);
		assertTrue(home.newCustRegTab.isDisplayed(), "New Customer Registration tab is displayed.");

	}

	public void custReg(String vehNumber, String vehName, String vehCategory, String kilometers, String custName,
			String email, String mobile, String address1, String techName) throws InterruptedException {

		click(custReg.vehNoContainer);
		assertTrue(custReg.vehNoContainer.isDisplayed(), "Vehicle Number field is visible");

		type(custReg.inputBox, vehNumber);
		getElement(custReg.vehNoResults, "tagName", "li", 0);
		
		Thread.sleep(2000);

		WebElement vehTypeSelected = driver.findElement(By.xpath(
				"//span[@id='select2-supervisorNameEdit-container']/span[@class= 'select2-selection__placeholder' and text()= 'Select vehicle name']"));

		if (vehTypeSelected.isDisplayed()) {
			
			click(custReg.vehTypeContainer);
			type(custReg.inputBox, vehName);
			getElement(custReg.vehTypeResults, "tagName", "li", 0);

			click(custReg.vehCatContainer);
			// type(custReg.inputBox, vehCategory);
			getElement(custReg.vehCatResults, "tagName", "li", 0);

			clear(custReg.custName);
			type(custReg.custName, custName);

			clear(custReg.custemail);
			type(custReg.custemail, email);
			clear(custReg.custMobile);
			type(custReg.custMobile, mobile);
			clear(custReg.custAddr);
			type(custReg.custAddr, address1);

			clear(custReg.chasisNbr);
			type(custReg.chasisNbr, "GR45I4355465");
			clear(custReg.engNbr);
			type(custReg.engNbr, "EN977F7988");
			clear(custReg.regDate);
			type(custReg.regDate, "23/02/2015");
			clear(custReg.mfgYear);
			type(custReg.mfgYear, "2015");

		} 

		clear(custReg.kmDriven);
		type(custReg.kmDriven, kilometers);

		WebElement nbrPlateSelected = driver.findElement(By.xpath(
				"//span[@id = 'select2-reg_nbr_plate_color-container' and @class = 'select2-selection__rendered']"));

		if (nbrPlateSelected.isDisplayed()) {

//			custReg.nbrPlateColorContainer.sendKeys(Keys.TAB);

		} else {

			click(custReg.nbrPlateColorContainer); // type(custReg.inputBox, "White");
			getElement(custReg.nbrPlateColorResults, "tagName", "li", 0);
		}

		WebElement custSourceSelected = driver.findElement(By.xpath(
				"//span[@id = 'select2-customerSourceMain-container' and @class = 'select2-selection__rendered']"));
		Thread.sleep(1000);
		if (custSourceSelected.isDisplayed()) {

		} else {
			click(custReg.custSourContainer); // type(custReg.inputBox, "uber");
			getElement(custReg.custSourResults, "tagName", "li", 0);
		}

		click(custReg.techNameContainer);
		getElement(custReg.techNameResults, "tagName", "li", 0);

		click(custReg.supNameContainer);
		getElement(custReg.supNameResults, "tagName", "li", 0);

	}

}
