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
public class SignUpLoginPage extends BasePage {
	
	private By loginBtn=By.xpath("//android.widget.TextView[contains(@text, 'Log In')]");
	
	private By signUpBtn=By.xpath("//android.widget.TextView[contains(@text, 'Sign Up')]");
	
	private By continueWithFB=By.xpath("//android.widget.TextView[contains(@text, 'Continue with Facebook')]");

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
	 * @return the continueWithFB
	 */
	public MobileElement getContinueWithFB() {
		return getElement(continueWithFB);
	}

	
	/**
	 * @return SignUpLoginPage
	 */
	@Step("Clicking on Login Button in Signup/Login Page..")
	public LoginPage clickLogin() {
		getLoginBtn().click();
			
		return getInstance(LoginPage.class);
			
		}
	@Step("Verifying whether SignUp option is displayed in page or not..")
	public boolean isLogOutSuccessful() {
		// TODO Auto-generated method stub
		return getContinueWithFB().isDisplayed();
	}

	@Step("Clicking on Login Button in Signup/Login Page..")
	public SignUpPage clickSignUpWithEmail() {
		// TODO Auto-generated method stub
		
		getSignUpBtn().click();
		
		return getInstance(SignUpPage.class);

	}
	
	

}
