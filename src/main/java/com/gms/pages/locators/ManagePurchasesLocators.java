package com.gms.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagePurchasesLocators {
	
	@FindBy(xpath = "//*[@id='content']/div[27]/div/div[2]/a")
	public WebElement managePurBtn;
	
	@FindBy(xpath = "//a[text()='Manage Purchase']")
	public WebElement managePurchasesBtn;
	
	@FindBy(xpath = "//label[text()='Detailed']")
	public WebElement detailedBtn;
	@FindBy(xpath = "//label[text()='Standard (Cash)']")
	public WebElement standardBtn;
	
	@FindBy(id = "invoNo")
	public WebElement invNoInput;
	@FindBy(id = "invoiceDate")
	public WebElement invDateInput;
	
	@FindBy(xpath = "//*[@id='mainBody']/span/span/span[1]/input")
	public WebElement inputBox;
	
	@FindBy(id = "select2-vndrName-container")
	public WebElement vendorContainer;
	@FindBy(id = "select2-vndrName-results")
	public WebElement vendorList;
	
	@FindBy(id = "select2-taxType-container")
	public WebElement taxTypeContainer;
	@FindBy(id = "select2-taxType-results")
	public WebElement taxTypeList;
	
	@FindBy(xpath = "//*[@id='mainBody']/div[31]/div[2]/div/div/div/div/div/div/div/div[4]/button[1]")
	public WebElement okBtn;
	
	@FindBy(id = "select2-taxSubType-container")
	public WebElement taxSubContainer;
	@FindBy(id = "select2-taxSubType-results")
	public WebElement taxSubList;
	
	@FindBy(id = "select2-marginType-container")
	public WebElement discTypeContainer;
	@FindBy(id = "select2-marginType-results")
	public WebElement discTypeList;
	
	@FindBy(id = "select2-product_margin_type-container")
	public WebElement profTypeContainer;
	@FindBy(id = "select2-product_margin_type-results")
	public WebElement profTypeList;
	
	@FindBy(xpath = "//*[@id='byRadioDivs']/label[text()='By item']")
	public WebElement byItem;
	@FindBy(xpath = "//*[@id='byRadioDivs']/label[text()='By vehicle']")
	public WebElement byVehicle;
	
//	@FindBy(xpath = "//*[@id='displayVehicleInput']//input[@placeholder='Select Vehicle Model']")
	@FindBy(xpath = "//*[@id='displayVehicleInput']/div[1]/span[1]/span[1]/span/ul/li/input")
	public WebElement vehBrand;

	@FindBy(id = "select2-vehicleBrandData-results")
	public WebElement vehBrandList;
	@FindBy(xpath = "//*[@id='displayVehicleInput']//input[@placeholder='Select Vehicle Model...']")
	public WebElement vehModel;
	@FindBy(xpath = "//*[@id='displayVehicleInput']//input[@placeholder='Select Vehicle Variant...']")
	public WebElement vehVariant;
	
	@FindBy(id = "partsDivRow")
	public WebElement partsDiv;
	
		
	@FindBy(xpath = "//*[@id='managePurchaseVehicleFrm']/div[5]/div/div[1]/button")
	//*[@id='managePurchaseVehicleFrm']/div[5]/div/div[1]/button
	public WebElement addMoreBtn;
	@FindBy(xpath = "//*[@id='managePurchaseVehicleFrm']/div[5]/div/div[2]/button")
	public WebElement savenUpdateBtn;
	
	
	
	
	
	
	
	
	

}
