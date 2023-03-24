package com.gms.pages.actions;


import static org.testng.Assert.*;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.sikuli.api.robot.Key;

import com.gms.base.Page;
import com.gms.pages.locators.HomePageLocators;

public class HomePage extends Page 
{
	public HomePageLocators homepage;
	
	public HomePage() 
	{
		this.homepage = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.homepage);		
	}
	
	public void clickNewCustRegTab() 
	{
		click(homepage.newCustRegTab);
		assertTrue(homepage.newCustRegTab.isDisplayed(), "New Customer Registration tab is displayed.");
	}
	
	public void clickMenuTab()
	{
		click(homepage.menuButton);
	}
	
	public void clickIMmenu()
	{
		click(homepage.imMenu);
	}

}
