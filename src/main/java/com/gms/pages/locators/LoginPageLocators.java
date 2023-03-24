package com.gms.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	@FindBy(id="userName")
	public WebElement userName;
	@FindBy(id="passwordLogin")
	public WebElement password;
	@FindBy(id="jsCap")
	public WebElement captchBox;
	@FindBy(xpath="//button[text()='Submit']")
	public WebElement submitBtn;
}
