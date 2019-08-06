/**
 * 
 */
package com.testingfoo.pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author udayseshadri
 *
 */
public class MenuPage extends BasePage{

	private By signUpLoginInBtn=By.xpath("//android.widget.TextView[contains(@text, 'Log')]");

	
	public MenuPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}


	/**
	 * @return the signUpLoginInBtn
	 */
	public MobileElement getSignUpLoginInBtn() {
		return getElement(signUpLoginInBtn);
	}
	
	/**
	 * @return SignUpLoginPage
	 */
	public SignUpLoginPage clickSignUpLogin() {
		getSignUpLoginInBtn().click();
			
		return getInstance(SignUpLoginPage.class);
			
		}

	
	

	
}
