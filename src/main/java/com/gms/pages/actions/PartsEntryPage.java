package com.gms.pages.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import com.gms.base.Page;
import com.gms.pages.locators.ManagePurchasesLocators;

public class PartsEntryPage extends Page {

	ManagePurchasesLocators managePurchases = new ManagePurchasesLocators();
	String vehPath0 = "//*[@id='select2-vehicleBrandData";
	String vehPath1 = "-results']/li[text()='";
	String vehPath2 = "']";

	String selectPath = "select2-";
	String typePath = "type";
	String containerPath = "-container";
	String resultsPath = "-results";

	String selVehBrandPath = "vehicleBrandData";
	String vehBrandPath = "vehicleBrandData";
	String audipath = "//li[text()='Audi']";
	String bmwPath = "//li[text()='BMW']";

	String catPath = "category_code";
	String partNoPath = "partNo";
	String batchPath = "batchNo";
	String sparePath = "spareNameDt";
	String brandPath = "proBrandName";
	String hsnPath = "hsnNo";
	String qtyPath = "qtyIn";
	String ratePath = "purchasePrice";
	String discPath = "margin";
	String marginPath = "product_margin_value";
	String locatorPath = "locator";
	String delBtPath1 = "//*[@class = 'divBox bc|";
	String delBtPath2 = "']/button";
	String partNoResPath = "suggestionDiv";

	@FindBy(xpath = "//input[@placeholder = 'Select Vehicle Brand']")
	public WebElement vehBranInput;

	public PartsEntryPage() {

		this.managePurchases = new ManagePurchasesLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.managePurchases);
	}

	public void partsEntryByVehicle() throws IOException, InterruptedException {

		int n = 0;

		FileInputStream inputStream = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx"));
		XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(inputStream);
		XSSFSheet sheet = workbook.getSheet("PartsByVehTest");

		int rowcount = sheet.getLastRowNum();

		for (n = 0; n < rowcount; n++) {

			WebElement prodTypeContainer = driver.findElement(By.id(selectPath + typePath + n + containerPath));
			scrolltoview(prodTypeContainer);
			click(prodTypeContainer);
			type(managePurchases.inputBox, sheet.getRow(n + 1).getCell(0).getStringCellValue());
			WebElement proTypeRes = driver.findElement(By.id(selectPath + typePath + n + resultsPath));
			getElement(proTypeRes, "tagName", "li", 0);

			WebElement partNo = driver.findElement(By.id(partNoPath + n));
			type(partNo, sheet.getRow(n + 1).getCell(2).getStringCellValue());

			Thread.sleep(2000);

			WebElement partNoResults = driver.findElement(By.id(partNoResPath + n));

			if (partNoResults.isDisplayed()) {
				getElement(partNoResults, "tagName", "li", 0);
			} else {
				WebElement spareContainer = driver.findElement(By.id(selectPath + sparePath + n + containerPath));
				click(spareContainer);
				type(managePurchases.inputBox, sheet.getRow(n + 1).getCell(3).getStringCellValue());
				WebElement spareRes = driver.findElement(By.id(selectPath + sparePath + n + resultsPath));
				getElement(spareRes, "tagName", "li", 0);

				WebElement brandContainer = driver.findElement(By.id(selectPath + brandPath + n + containerPath));
				click(brandContainer);
				type(managePurchases.inputBox, sheet.getRow(n + 1).getCell(4).getStringCellValue());
				WebElement brandRes = driver.findElement(By.id(selectPath + brandPath + n + resultsPath));
				getElement(brandRes, "tagName", "li", 0);

				WebElement hsnContainer = driver.findElement(By.id(selectPath + hsnPath + n + containerPath));
				click(hsnContainer);
				type(managePurchases.inputBox, sheet.getRow(n + 1).getCell(5).getStringCellValue());
				WebElement hsnRes = driver.findElement(By.id(selectPath + hsnPath + n + resultsPath));
				getElement(hsnRes, "tagName", "li", 0);
			}
			Thread.sleep(500);
			WebElement qty = driver.findElement(By.id(qtyPath + n));
			clear(qty);
			type(qty, sheet.getRow(n + 1).getCell(6).getStringCellValue());

			WebElement rate = driver.findElement(By.id(ratePath + n));
			clear(rate);
			type(rate, sheet.getRow(n + 1).getCell(7).getStringCellValue());
			WebElement discount = driver.findElement(By.id(discPath + n));
			clear(discount);
			type(discount, sheet.getRow(n + 1).getCell(8).getStringCellValue());
			WebElement profit = driver.findElement(By.id(marginPath + n));
			clear(profit);
			type(profit, sheet.getRow(n + 1).getCell(9).getStringCellValue());

//			WebElement locator = driver.findElement(By.id(locatorPath+n));
//			type(locator, sheet.getRow(n + 1).getCell(10).getStringCellValue());
			Thread.sleep(500);
			scrolltoview(managePurchases.addMoreBtn);
			click(managePurchases.addMoreBtn);

		}
		Thread.sleep(500);
		WebElement delBtn = driver.findElement(By.xpath(delBtPath1 + (n) + delBtPath2));
		click(delBtn);
		Thread.sleep(500);
		scrolltoview(managePurchases.savenUpdateBtn);
		click(managePurchases.savenUpdateBtn);
		Thread.sleep(500);
		WebElement okBtn = driver.findElement(By.xpath("//button[text()='ok']"));
		click(okBtn);

		// Close the workbook and input stream
		workbook.close();
		inputStream.close();

	}

	public void partsEntryByItem() throws IOException, InterruptedException {

		int n = 0;

		FileInputStream inputStream1 = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx"));
		XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(inputStream1);
		XSSFSheet sheet = workbook.getSheet("PartsByItemTest");

		int rowcount = sheet.getLastRowNum();

		for (n = 0; n < rowcount; n++) {

			String xpath1 = selectPath + typePath + n + resultsPath;
			System.out.println(xpath1);

			WebElement prodTypeContainer = driver.findElement(By.id(selectPath + typePath + n + containerPath));
			scrolltoview(prodTypeContainer);
			click(prodTypeContainer);
			type(managePurchases.inputBox, sheet.getRow(n + 1).getCell(0).getStringCellValue());
			WebElement proTypeRes = driver.findElement(By.id(selectPath + typePath + n + resultsPath));
			getElement(proTypeRes, "tagName", "li", 0);

			WebElement prodCatContainer = driver.findElement(By.id(selectPath + catPath + n + containerPath));
			scrolltoview(prodCatContainer);
			click(prodCatContainer);
			type(managePurchases.inputBox, sheet.getRow(n + 1).getCell(1).getStringCellValue());
			WebElement proCatRes = driver.findElement(By.id(selectPath + catPath + n + resultsPath));
			getElement(proCatRes, "tagName", "li", 0);

			WebElement partNo = driver.findElement(By.id(partNoPath + n));
			type(partNo, sheet.getRow(n + 1).getCell(2).getStringCellValue());

			Thread.sleep(2000);

			WebElement partNoResults = driver.findElement(By.id(partNoResPath + n));

			if (partNoResults.isDisplayed()) {
				getElement(partNoResults, "tagName", "li", 0);
			} else {
				Thread.sleep(500);
				WebElement spareContainer = driver.findElement(By.id(selectPath + sparePath + n + containerPath));
				click(spareContainer);
				Thread.sleep(500);
				type(managePurchases.inputBox, sheet.getRow(n + 1).getCell(4).getStringCellValue());
				WebElement spareRes = driver.findElement(By.id(selectPath + sparePath + n + resultsPath));
				getElement(spareRes, "tagName", "li", 0);

				WebElement brandContainer = driver.findElement(By.id(selectPath + brandPath + n + containerPath));
				click(brandContainer);
				Thread.sleep(500);
				type(managePurchases.inputBox, sheet.getRow(n + 1).getCell(5).getStringCellValue());
				WebElement brandRes = driver.findElement(By.id(selectPath + brandPath + n + resultsPath));
				getElement(brandRes, "tagName", "li", 0);

				Thread.sleep(500);
				String vehicle1 = sheet.getRow(n + 1).getCell(6).getStringCellValue();
				String vehicle2 = sheet.getRow(n + 1).getCell(7).getStringCellValue();
				WebElement vehicleSel = driver.findElement(
						By.xpath("//*[@id='spareVehicleDiv" + n + "']/div/div[1]/span[1]/span[1]/span/ul/li/input"));
				System.out.println(vehicleSel);
				type(vehicleSel, vehicle1);
				System.out.println(vehPath0 + n + vehPath1 + vehicle1 + vehPath2);
				Thread.sleep(500);
				driver.findElement(By.xpath(vehPath0 + n + vehPath1 + vehicle1 + vehPath2)).click();
				type(vehicleSel, vehicle2);
				System.out.println(vehPath0 + n + vehPath1 + vehicle2 + vehPath2);
				Thread.sleep(500);
				driver.findElement(By.xpath(vehPath0 + n + vehPath1 + vehicle2 + vehPath2)).click();

				WebElement hsnContainer = driver.findElement(By.id(selectPath + hsnPath + n + containerPath));
				click(hsnContainer);
				Thread.sleep(500);
				type(managePurchases.inputBox, sheet.getRow(n + 1).getCell(10).getStringCellValue());
				WebElement hsnRes = driver.findElement(By.id(selectPath + hsnPath + n + resultsPath));
				getElement(hsnRes, "tagName", "li", 0);
			}
			Thread.sleep(500);
			WebElement qty = driver.findElement(By.id(qtyPath + n));
			clear(qty);
			type(qty, sheet.getRow(n + 1).getCell(11).getStringCellValue());

			WebElement rate = driver.findElement(By.id(ratePath + n));
			clear(rate);
			type(rate, sheet.getRow(n + 1).getCell(12).getStringCellValue());
			WebElement discount = driver.findElement(By.id(discPath + n));
			clear(discount);
			type(discount, sheet.getRow(n + 1).getCell(13).getStringCellValue());
			WebElement profit = driver.findElement(By.id(marginPath + n));
			clear(profit);
			type(profit, sheet.getRow(n + 1).getCell(14).getStringCellValue());

			WebElement locator = driver.findElement(By.id(locatorPath + n));
			clear(locator);
			type(locator, sheet.getRow(n + 1).getCell(15).getStringCellValue());
			Thread.sleep(500);
			WebElement addMoreBtn = driver
					.findElement(By.xpath("//*[@id='managePurchaseSpareFrm']/div[3]/div/div[1]/button"));
			scrolltoview(addMoreBtn);
			click(addMoreBtn);

		}
		Thread.sleep(500);
		WebElement delBtn = driver.findElement(By.xpath(delBtPath1 + (n) + delBtPath2));
		click(delBtn);
		Thread.sleep(500);
		WebElement saveBtn = driver.findElement(By.id("miscsaveFormID"));
		scrolltoview(saveBtn);
		click(saveBtn);
		WebElement okBtn = driver.findElement(By.xpath("//button[text()='ok']"));
		click(okBtn);

		// Close the workbook and input stream
		workbook.close();
		inputStream1.close();

	}

}
