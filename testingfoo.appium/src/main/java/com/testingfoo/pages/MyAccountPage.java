package com.testingfoo.pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;

public class MyAccountPage extends BasePage{
	
	private By logOutBtn=By.id("com.kfcaus.ordering:id/frag_account_logout_tv");
	

	public MyAccountPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	

	/**
	 * @return the logOutBtn
	 */
	public MobileElement getLogOutBtn() {
		return getElement(logOutBtn);
	}




	@Step("Clicking on Logout Button")
	public SignUpLoginPage clickLogOut() {
		// TODO Auto-generated method stub
		
		getLogOutBtn().click();
		
		return getInstance(SignUpLoginPage.class);
		
	}
	
	

}
