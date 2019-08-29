/**
 * 
 */
package com.testingfoo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;

/**
 * @author udayseshadri
 *
 */
public class HomePage extends BasePage {
	
	//Page Locator
	private By menuBtn=MobileBy.AccessibilityId("open navigation menu"); 
	
	private By orderNowBtn=By.id("com.kfcaus.ordering:id/icon_button_container_ll");
	
	
	public HomePage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}

	//getters
	/**
	 * @return the menuBtn
	 */
	public MobileElement getMenuBtn() {
		return getElement(menuBtn);
	}


	/**
	 * @return the orderNow
	 */
	public MobileElement getOrderNow() {
		return getElement(orderNowBtn);
	}
	
	
	
	/**
	 * @return MenuPage
	 */
	@Step("Clicking on Menu Button")
	public MenuPage clickMenu() {
		getMenuBtn().click();
		
		return getInstance(MenuPage.class);
		
	}
	
	@Step("Verifying whether OrderNow button exists in HomePage or not.")
	public boolean isOrderNowBtnAvailable() {
		
		if(getMenuBtn().isDisplayed()) {
			return true;
		}
		else
			return false;
	}

}
