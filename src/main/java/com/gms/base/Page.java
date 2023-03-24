package com.gms.base;


import java.time.Duration;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gms.utilities.ExcelReader;
import com.gms.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {

	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
	public static WebDriverWait wait;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static String browser;
	public static String elementtext;
	public static JavascriptExecutor js;
	
	public static void initConfiguration() {
		
		
		if (Constants.browser.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.info("Launching Firefox !!!");

		} else if (Constants.browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			log.info("Launching Chrome !!!");
			

		} else if (Constants.browser.equals("ie")) {

			WebDriverManager.chromedriver().setup();
			driver = new InternetExplorerDriver();
			log.debug("Launching IE");
		}

		driver.get(Constants.testsiteurl);
		log.info("Navigated to : " + Constants.testsiteurl);
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	public static void click(WebElement element) {
		
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
		log.debug("Clicking on an Element : " + element);
		test.log(LogStatus.INFO, "Clicking on : " + element);
	}

	public static void type(WebElement element, String value) {

		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);

		log.debug("Typing in an Element : " + element + " entered value as : " + value);
		test.log(LogStatus.INFO, "Typing in : " + element + " entered value as " + value);

	}
	
	public static void clear(WebElement element) {
		
		element.clear();
		test.log(LogStatus.INFO, "Clearing data in : " + element);
	}
	
	public static void getElement(WebElement element, String locName, String locText, int nthelement ) throws InterruptedException  {
		
		
		
		if (locName == "tagName")
		{
			try {
				
				List <WebElement> elements = element.findElements(By.tagName(locText));
				Thread.sleep(1000);
				WebElement element1 = elements.get(nthelement);
				elementtext = elements.get(nthelement).getText();
				click(element1);
				
			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
				List <WebElement> elements = element.findElements(By.tagName(locText));
				Thread.sleep(1000);
				WebElement element1 = elements.get(nthelement);
				elementtext = elements.get(nthelement).getText();
				click(element1);
			}
		}
		else if (locName == "xpath")
		{
			try {
				
				List <WebElement> elements = element.findElements(By.xpath(locText));
				Thread.sleep(1000);
				WebElement element1 = elements.get(nthelement);
				click(element1);
			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
				
				List <WebElement> elements = element.findElements(By.xpath(locText));
				Thread.sleep(1000);
				WebElement element1 = elements.get(nthelement);
				click(element1);
			}
		}
		else if (locName == "id")
		{
			
			try {
				
				List <WebElement> elements = element.findElements(By.id(locText));
				Thread.sleep(1000);
				WebElement element1 = elements.get(nthelement);
				click(element1);
			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
				
				List <WebElement> elements = element.findElements(By.id(locText));
				Thread.sleep(1000);
				WebElement element1 = elements.get(nthelement);
				click(element1);
			}
		}
				
		test.log(LogStatus.INFO, "Clicking on the element from dropdown : " + elementtext );
		
	}
	
	public int countElements(WebElement element) throws InterruptedException {
		
		List<WebElement> elements = element.findElements(By.tagName("li"));
		Thread.sleep(500);
		int count1 = elements.size();
		return count1;
	}
		
	public static void scrolltoview(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
		
	public static void quitBrowser() {

		driver.quit();

	}

}
