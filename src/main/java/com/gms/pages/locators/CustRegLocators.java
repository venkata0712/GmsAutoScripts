package com.gms.pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustRegLocators {
	
	
	@FindBy(id = "select2-customerVehicleNbr-container")
	public WebElement vehNoContainer;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	public WebElement inputBox;
	@FindBy(id = "select2-customerVehicleNbr-results")
	public WebElement vehNoResults;

	@FindBy(id = "select2-vehicleType-container")
	public WebElement vehTypeContainer;
	@FindBy(id = "select2-vehicleType-results")
	public WebElement vehTypeResults;
	@FindBy(xpath= "//*[@id='select2-vehicleType-container']/span")
	public WebElement vehNamePlaceHolder;
	
	@FindBy(id = "select2-vehicleCategory-container")
	public WebElement vehCatContainer;
	@FindBy(id = "select2-vehicleCategory-results")
	public WebElement vehCatResults;

	@FindBy(id = "kilometerDriven")
	public WebElement kmDriven;

	@FindBy(id = "select2-reg_nbr_plate_color-container")
	public WebElement nbrPlateColorContainer;
	@FindBy(xpath= "//*[@id='select2-reg_nbr_plate_color-container']/span")
	public WebElement nbrPlatePlaceHolder;
	@FindBy(id = "select2-reg_nbr_plate_color-results")
	public WebElement nbrPlateColorResults;
	

	@FindBy(id = "customerName")
	public WebElement custName;

	@FindBy(id = "select2-customerSourceMain-container")
	public WebElement custSourContainer;
	@FindBy(id = "select2-customerSourceMain-results")
	public WebElement custSourResults;
	@FindBy(xpath= "//*[@id='select2-customerSourceMain-container']/span")
	public WebElement custSourcePlaceHolder;
	

	@FindBy(id = "emailIdCust")
	public WebElement custemail;
	@FindBy(id = "customerMobile")
	public WebElement custMobile;
	@FindBy(id = "customer_address")
	public WebElement custAddr;

	@FindBy(id = "select2-technicianName-container")
	public WebElement techNameContainer;
	@FindBy(id = "select2-technicianName-results")
	public WebElement techNameResults;

	@FindBy(id = "select2-supervisorName-container")
	public WebElement supNameContainer;
	@FindBy(id = "select2-supervisorName-results")
	public WebElement supNameResults;

	@FindBy(id = "new_chasis_no")
	public WebElement chasisNbr;
	@FindBy(id = "new_engine_no")
	public WebElement engNbr;
	@FindBy(id = "new_date_of_registeration")
	public WebElement regDate;
	@FindBy(id = "veh_mfg_year")
	public WebElement mfgYear;

	@FindBy(id = "registerVehicle")
	public WebElement submitBtn;
	@FindBy(id = "resetregisterVehicle")
	public WebElement resetBtn;
	@FindBy(id = "resetregisterVehicle")
	public WebElement closeBtn;
	
	@FindBy(xpath = "//div[text()='Vehicle details saved successfully']")
	public WebElement sucessmsg;
	@FindBy(xpath = "//button[text()='Go to estimation']")
	public WebElement gotoEstBtn;
	@FindBy(xpath = "//button[text()='Go to estimation']/following-sibling::button")
	public WebElement cancelEstBtn;
	
	
}
