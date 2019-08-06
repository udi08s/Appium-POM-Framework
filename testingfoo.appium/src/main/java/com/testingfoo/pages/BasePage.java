package com.testingfoo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BasePage extends Page{

	public BasePage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}


	@Override
	public MobileElement getElement(By locator) {
		MobileElement element=null;
		try {
			waitForElementPresent(locator);
			element=driver.findElement(locator);
			return element;
		}
		catch(Exception e) {
			System.out.println("Exception in the getElement method.. of BasePage");
			e.printStackTrace();
		}
		
		return element;
	}
	
	public MobileElement getElements(By locator) {
		MobileElement elements=null;
		try {
			waitForElementsPresent(locator);
			elements=driver.findElement(locator);
			return elements;
		}
		catch(Exception e) {
			System.out.println("Exception in the getElement method.. of BasePage");
			e.printStackTrace();
		}
		
		return elements;
	}
	
	public void waitForElementsPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
			
		}
		catch(Exception e) {
			System.out.println("Exception occured in BasePage while waiting for element"+locator.toString());
			e.printStackTrace();
		}
		
	}
	

	@Override
	public void waitForElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		catch(Exception e) {
			System.out.println("Exception occured in BasePage while waiting for element"+locator.toString());
			e.printStackTrace();
		}
		
	}
	
	
	

}
