package com.komoot.qa.tests;

//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.komoot.qa.base.TestBase;
import com.komoot.qa.pages.SignUpPage;
import com.komoot.qa.pages.StartPage;

public class SignUpTest extends TestBase{
	
	StartPage startPage;
	SignUpPage signUpPage;
	
	public SignUpTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		startPage = new StartPage();
		signUpPage = startPage.takeToSignUpPage();
		
	}
	
	
	@Test
	public void userSignUpTest() {
		
		signUpPage.signUp();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();		

	}
	
}
