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
public class LoginPage extends BasePage {

	private By emailID=By.xpath("//android.widget.EditText[contains(@text, 'Email')]");
	private By password=By.xpath("//android.widget.EditText[contains(@text, 'Password')]");
	private By loginBtn=By.xpath("//*[contains(@text, 'Log In')]");
	
	
	public LoginPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}


	/**
	 * @return the emailID
	 */
	public MobileElement getEmailID() {
		return getElement(emailID);
	}


	/**
	 * @return the password
	 */
	public MobileElement getPassword() {
		return getElement(password);
	}
	
	

	/**
	 * @return the loginBtn
	 */
	public MobileElement getLoginBtn() {
		return getElement(loginBtn);
	}



	/**
	 * @return void
	 */
	@Step("Entering Username text..")
	public void enterEmailID(String emailID) {
		getEmailID().sendKeys(emailID);
			
		}
	
	/**
	 * @return void
	 */
	@Step("Entering Password text..")
	public void enterPassword(String password) {
		getPassword().sendKeys(password);
			
		}
	
	/**
	 * @return HomePage
	 */
	@Step("Clicking on Login Button..")
	public HomePage clickLogin() {
		
		getLoginBtn().click();
		
		return getInstance(HomePage.class);
		
	}

}
