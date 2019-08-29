package com.testingfoo.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.testingfoo.pages.HomePage;
import com.testingfoo.pages.MenuPage;
import com.testingfoo.pages.MyAccountPage;
import com.testingfoo.pages.SignUpLoginPage;
import com.testingfoo.pages.SignUpPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class SignUpTest extends BaseTest{

	
	private HomePage homePage;
	private MenuPage menuPage;
	private MyAccountPage myAccountPage;
	private SignUpLoginPage signUpLoginPage;
	private SignUpPage signUpPage;
	private String newEmailID;
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Description("Testing the SignUp test")
	public void signUpTestWithValidCredentials() {
		
		homePage=page.getInstance(HomePage.class);
		menuPage=homePage.clickMenu();
		signUpLoginPage=menuPage.clickSignUpLogin();
		signUpPage=signUpLoginPage.clickSignUpWithEmail();
		signUpPage.enterFirstName("Test");
		signUpPage.enterLastName("udayy");
		newEmailID="testuday"+(int)Math.random()+"@maildrop.cc";
		signUpPage.enterEmailID(newEmailID);
		signUpPage.enterPhoneNumber("0422672022");
		signUpPage.enterPassword("pass1234");
		signUpPage.enterConfirmPassword("pass1234");
		signUpPage.clickSignUpBtn();
		Assert.assertTrue(homePage.isOrderNowBtnAvailable(), "SignUp was not Successful");
	}
	
	@AfterMethod
	public void afterMethod() {
		
		menuPage=homePage.clickMenu();
		myAccountPage=menuPage.clickMyAccountOption();
		signUpLoginPage=myAccountPage.clickLogOut();
		Assert.assertTrue(signUpLoginPage.isLogOutSuccessful(), "Logout was not Successful");

	}
}
