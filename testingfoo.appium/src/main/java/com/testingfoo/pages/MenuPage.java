/**
 * 
 */
package com.testingfoo.pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;

/**
 * @author udayseshadri
 *
 */
public class MenuPage extends BasePage{

	private By signUpLoginInBtn=By.xpath("//android.widget.TextView[contains(@text, 'Log')]");
	private By myAccountBtn=By.xpath("//android.widget.TextView[contains(@text, 'My Account')]");


	
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
	 * @return the myAccountBtn
	 */
	public MobileElement getMyAccountBtn() {
		return getElement(myAccountBtn);
	}




	/**
	 * @return SignUpLoginPage
	 */
	@Step("Clicking on Sign-Up Button..")
	public SignUpLoginPage clickSignUpLogin() {
		getSignUpLoginInBtn().click();
			
		return getInstance(SignUpLoginPage.class);
			
		}

	@Step("Clicking on My Account Button..")
	public MyAccountPage clickMyAccountOption() {
		
		getMyAccountBtn().click();
		
		return getInstance(MyAccountPage.class);
		
	}

	
	

	
}
