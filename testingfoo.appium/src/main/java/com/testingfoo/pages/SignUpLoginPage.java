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
public class SignUpLoginPage extends BasePage {
	
	private By loginBtn=By.xpath("//android.widget.TextView[contains(@text, 'Log In')]");
	
	private By signUpBtn=By.xpath("//android.widget.TextView[contains(@text, 'Sign Up')]");

	public SignUpLoginPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}

	/**
	 * @return the loginBtn
	 */
	public MobileElement getLoginBtn() {
		return getElement(loginBtn);
	}

	/**
	 * @return the signUpBtn
	 */
	public MobileElement getSignUpBtn() {
		return getElement(signUpBtn);
	}
	
	/**
	 * @return SignUpLoginPage
	 */
	public LoginPage clickLogin() {
		getLoginBtn().click();
			
		return getInstance(LoginPage.class);
			
		}
	
	

}
