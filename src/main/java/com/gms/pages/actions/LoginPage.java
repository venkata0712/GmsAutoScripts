package com.gms.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.gms.base.Page;
import com.gms.pages.locators.LoginPageLocators;

public class LoginPage extends Page{

public LoginPageLocators loginPage;
	

	public LoginPage(){
		
		this.loginPage = new LoginPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.loginPage);
		
	}
	
	public void doLogin(String username,String password) throws InterruptedException{
			
		type(loginPage.userName, username);
		type(loginPage.password, password);
		click(loginPage.captchBox);
		Thread.sleep(20000);
		click(loginPage.submitBtn);	
		
	}
}
