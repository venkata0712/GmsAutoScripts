package com.gms.pages.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.gms.base.Page;
import com.gms.pages.locators.ManagePurchasesLocators;

public class ManagePurchasesPage extends Page {

	public ManagePurchasesLocators managePurchases = new ManagePurchasesLocators();

	public ManagePurchasesPage() {
		this.managePurchases = new ManagePurchasesLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.managePurchases);
	}

	public void clickManagePurBtn() {
		click(managePurchases.managePurBtn);
	}

	public void clickDetailedBtn() {
		click(managePurchases.detailedBtn);
	}
	
	public void clickStandardBtn() {
		click(managePurchases.standardBtn);
	}

	public void submitInvDetails(String invNo, String invDate, String vendorName, String taxType, String tabSub, String discType, String profType) throws InterruptedException {
		
		Thread.sleep(3000);
		type(managePurchases.invNoInput, invNo);
		type(managePurchases.invDateInput, invDate);
		Thread.sleep(3000);
		click(managePurchases.vendorContainer);
		type(managePurchases.inputBox, vendorName);
		getElement(managePurchases.vendorList, "tagName", "li", 0);

		click(managePurchases.taxTypeContainer);
		type(managePurchases.inputBox, taxType);
		getElement(managePurchases.taxTypeList, "tagName", "li", 0);

		click(managePurchases.okBtn);
		Thread.sleep(3000);

		click(managePurchases.taxSubContainer);
		type(managePurchases.inputBox, tabSub);
		getElement(managePurchases.taxSubList, "tagName", "li", 0);

		click(managePurchases.discTypeContainer);
		type(managePurchases.inputBox, discType);
		getElement(managePurchases.discTypeList, "tagName", "li", 0);

		click(managePurchases.profTypeContainer);
		type(managePurchases.inputBox, profType);
		getElement(managePurchases.profTypeList, "tagName", "li", 0);

	}

	public void clickByVehicle() {
		
		click(managePurchases.byVehicle);
	}

	public void clickByItem() {
		
		click(managePurchases.byItem);
	}
	
	String audipath = "//li[text()='Maruti']"; 
	String bmwPath = "//li[text()='Hyundai']";
	
	@FindBy(xpath = "//*[@id='vehicleBrandData']/parent::div//input")
	public WebElement vehBrandInput;
	@FindBy(id = "select2-vehicleBrandData-results")
	public WebElement vehBrandRes;
	
	public void selVehBrand() throws InterruptedException {
		
//		click(managePurchases.vehBrand);
//		driver.findElement(By.xpath(audipath)).click();;
//		click(managePurchases.vehBrand);
//		driver.findElement(By.xpath(bmwPath)).click();
		Thread.sleep(2000);
		click(managePurchases.vehBrand);
		type(managePurchases.vehBrand, "Maruti");
		driver.findElement(By.xpath(audipath)).click();;
//		getElement(vehBrandRes, "tagName", "li", 0);
		Thread.sleep(2000);
		click(managePurchases.vehBrand);
		type(managePurchases.vehBrand, "Hyundai");
		driver.findElement(By.xpath(bmwPath)).click();
//		getElement(vehBrandRes, "tagName", "li", 0);
		
	}

}
