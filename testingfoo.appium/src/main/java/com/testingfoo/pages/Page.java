package com.testingfoo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public abstract class Page {
	
	//WebDriver driver;
	public AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	
	public Page(AndroidDriver<MobileElement> driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(this.driver,15);
	}
	//abstract method
	//public abstract String getPageTitle();
	
	//public abstract String getPageHeader(By locator);
	
	public abstract MobileElement getElement(By locator);
	
	public abstract void waitForElementPresent(By locator);
	
	//public abstract void waitForPageTitle(String title);
	
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
		try {
		return pageClass.getDeclaredConstructor(AndroidDriver.class).newInstance(this.driver);
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
