package com.gms.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	@FindBy(id = "customerReg")
	public WebElement newCustRegTab;
	@FindBy(id = "dashBoard")
	public WebElement offnProTab;
	@FindBy(id = "shortCuts")
	public WebElement shortcutsTab;
	@FindBy(id = "//div[@id='tableDiv_wrapper']//input[@type='search']")
	public WebElement searchBox;
	
	
	@FindBy(id = "about")
	public WebElement bussIntiButton;
	@FindBy(id = "menu")
	public WebElement menuButton;
	@FindBy(xpath = "//li[@id = 'menuTooltipId']/following-sibling::li")
	public WebElement welcome;
	@FindBy(id = "menuTooltipId")
	public WebElement notification;
	
	@FindBy(xpath = "//li[@class = 'menu_list']/a[text()='Inventory Management']")
	public WebElement imMenu;
	

	// Locators for all the button in the table first row.
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[1]/td/input[contains(@onclick, 'serviceEstimation')]")
	public WebElement estimationBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[1]/td/button[contains(@onclick, 'readyAlertModal')]")
	public WebElement readyBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[1]/td/button[contains(@href, '#askDoneMsgModal')]")
	public WebElement invoiceBtnRed;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[1]/td/input[contains(@onclick, 'openDiscountModel')]")
	public WebElement discBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[1]/td/input[contains(@onclick, 'showCouponDetails')]")
	public WebElement couponBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[1]/td/input[contains(@onclick, 'showPaymentDetails')]")
	public WebElement paymentBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[2]/td/ul/li/span/i[contains(@onclick, 'openVehicleHistory')]")
	public WebElement vehHistoryBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[2]/td/ul/li/span[2]/button[contains(@onclick, 'editCustomerDetails')]")
	public WebElement editProfileBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[2]/td/ul/li/span[2]/button[contains(@onclick, 'viewRCDetails')]")
	public WebElement editRCDetBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[2]/td/ul/li/span[2]/button[contains(@onclick, 'showInsuranceDetails')]")
	public WebElement insuranceDetBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[2]/td/ul/li/span[2]/button[contains(@onclick, 'saveInsuranceEstimation')]")
	public WebElement insuranceEstBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[2]/td/ul/li/span[2]/button[contains(@onclick, 'checkSalvageInfo')]")
	public WebElement salvageInfoBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[2]/td/ul/li/span[2]/button[contains(@onclick, 'showFeedbackForm')]")
	public WebElement feedbackFormBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[2]/td/ul/li/span[2]/button[contains(@onclick, 'uploadImages')]")
	public WebElement uploadImgBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[2]/td/ul/li/span[2]/button[contains(@onclick, 'smsRemindersStatus')]")
	public WebElement smsRemindBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[2]/td/ul/li/span[2]/button[contains(@onclick, 'deleteCustomerRecord')]")
	public WebElement deleteRecBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[2]/td/ul/li/span[2]/div[contains(@onclick, 'updateDueDate')]/span")
	public WebElement serviceDueDtBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[2]/td/ul/li/span[2]/button[contains(@onclick, 'generateGatePass')]")
	public WebElement gatepassBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[2]/td/ul/li/span[2]/button[contains(@onclick, 'checkBillType')]")
	public WebElement doneBtn;
	@FindBy(xpath = "//*[@id='tableDiv']/tbody/tr[2]/td/ul/li/span[2]/button[contains(@onclick, 'makeInvoiceBlank')]")
	public WebElement changeInvBtn;
	
	
	//Locators for all the elements in Estimation window
	
	@FindBy(id = "liIdJOB")
	public WebElement jobcardTab;
	@FindBy(id = "liIdSP")
	public WebElement sparesTab;
	@FindBy(xpath = "//li/a[text()='Services']")
	public WebElement servicesTab;
	@FindBy(xpath = "//li/a[text()='Rejected']")
	public WebElement rejectedTab;
	@FindBy(id = "liOffers")
	public WebElement offersTab;
	
	@FindBy(xpath = "//*[@id='estimationTab']/div/a[contains(@onclick, 'manageTechnicianTime')]")
	public WebElement manageTechBtn;
	@FindBy(xpath = "//*[@id='estimationTab']/div/a[contains(@onclick, 'showCartList')]")
	public WebElement cartBtn;
	@FindBy(xpath = "//*[@id='estimationTab']/div/a[@title='Add Spares']")
	public WebElement addSparesBtn;
	@FindBy(xpath = "//*[@id='estimationTab']/div/a[contains(@onclick, 'displaySparesMaster')]")
	public WebElement addServicesBtn;
	@FindBy(xpath = "//*[@id='estimationTab']/div/a[contains(@onclick, 'checkVehicleCategory')]")
	public WebElement inspectionBtn;
	
	
	//Locators for all the fields at JobCard Tab
	
	@FindBy(id = "add_job_card")
	public WebElement addToListJcBtn;
	@FindBy(id = "//button[contains(@onclick, 'saveJobCard')]")
	public WebElement saveJcBtn;
	@FindBy(id = "//button[contains(@onclick, 'saveJobCard')]/following-sibling::button[text()='Close']")
	public WebElement closeJcBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'sendJobCardSms')]")
	public WebElement sendJcSmsBtn;
	@FindBy(xpath = "//div[text()='Are you sure you want to sms?']")
	public WebElement jcSmsAlertMsg;
	@FindBy(xpath = "//button[text()='confirm']")
	public WebElement confirmSmsBtn;
	@FindBy(xpath = "//button[text()='cancel']")
	public WebElement cancelSmsBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'viewJobCard')]")
	public WebElement viewJcBtn;
	
	
	//Locators for all the fields at Spares Tab
	@FindBy(id = "add_field_button")
	public WebElement addToListSpBtn;
	
	@FindBy(xpath = "//*[@id='showColMd4']/div[2]/button[text()=' Print Estimate Bill']")
	public WebElement printEstBtn;
	@FindBy(xpath = "//*[@id=\"generateInvoiceDivSpare2\"]/button[text()='Push to Insurance Est']")
	public WebElement pushInsuranceEstBtn;
	
	@FindBy(xpath = "//button[text()='Standard Estimates']")
	public WebElement stdEstBtn;
	@FindBy(xpath = "//button[text()='Detailed Estimates']")
	public WebElement detEstBtn;
	@FindBy(xpath = "//*[@id=\"modalBillType\"]/div/div/div[3]/button")
	public WebElement closeEstPopBtn;
	
	
	
	
}
