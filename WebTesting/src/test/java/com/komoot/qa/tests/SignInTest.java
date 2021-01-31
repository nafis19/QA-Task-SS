package com.komoot.qa.tests;

import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.komoot.qa.base.TestBase;
import com.komoot.qa.pages.SignInPage;
import com.komoot.qa.pages.SignUpPage;
import com.komoot.qa.pages.StartPage;

public class SignInTest extends TestBase {
	
	StartPage startPage;
	SignUpPage signUpPage;
	SignInPage signInPage;
	
	public SignInTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		startPage = new StartPage();
		signInPage = new SignInPage();
		signUpPage = startPage.takeToSignUpPage();
		
	}
	
	
	@Test
	public void userSignInTest() {
		
		signInPage.userSignIn(prop.getProperty("email"), prop.getProperty("password"));
		
		String text2 = signInPage.verifyPage();
		System.out.println(text2);
		Assert.assertEquals(text2, "Find the Perfect Tour");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();		

	}

}
