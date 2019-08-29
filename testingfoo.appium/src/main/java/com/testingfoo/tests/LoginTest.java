/**
 * 
 */
package com.testingfoo.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testingfoo.pages.HomePage;
import com.testingfoo.pages.LoginPage;
import com.testingfoo.pages.MenuPage;
import com.testingfoo.pages.MyAccountPage;
import com.testingfoo.pages.SignUpLoginPage;
import com.testingfoo.utils.ExtentTestNGIReporterListener;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

/**
 * @author udayseshadri
 *
 */
public class LoginTest extends BaseTest{

	private HomePage homePage;
	private MenuPage menuPage;
	private MyAccountPage myAccountPage;
	private SignUpLoginPage signUpLoginPage;
   

	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Description("Testing the LogIn test")
	public void loginTestWithValidCredentials() {
		
		homePage=page.getInstance(HomePage.class);
		menuPage=homePage.clickMenu();
		signUpLoginPage=menuPage.clickSignUpLogin();
		LoginPage loginPage=signUpLoginPage.clickLogin();
		loginPage.enterEmailID("testuday@maildrop.cc");
		loginPage.enterPassword("pass1234");
		homePage=loginPage.clickLogin();
		Assert.assertTrue(homePage.isOrderNowBtnAvailable(), "Login was not Successful");
	}
	
	@AfterMethod
	public void afterMethod() {
		
		menuPage=homePage.clickMenu();
		myAccountPage=menuPage.clickMyAccountOption();
		signUpLoginPage=myAccountPage.clickLogOut();
		Assert.assertTrue(signUpLoginPage.isLogOutSuccessful(), "Logout was not Successful");

	}
}
