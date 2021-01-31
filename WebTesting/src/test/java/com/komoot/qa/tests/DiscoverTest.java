package com.komoot.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.komoot.qa.base.TestBase;
import com.komoot.qa.pages.DiscoverPage;
import com.komoot.qa.pages.SignInPage;
import com.komoot.qa.pages.SignUpPage;
import com.komoot.qa.pages.StartPage;

public class DiscoverTest extends TestBase{
	
	StartPage startPage;
	SignUpPage signUpPage;
	SignInPage signInPage;
	DiscoverPage discoverPage;
	
	public DiscoverTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		startPage = new StartPage();
		signInPage = new SignInPage();
		discoverPage = new DiscoverPage();
		signUpPage = startPage.takeToSignUpPage();
		signInPage.userSignIn(prop.getProperty("email"), prop.getProperty("password"));
		
	}
	
	
	@Test(priority=1)
	public void verifyDiscoverTextTest() {
		
		Assert.assertEquals(discoverPage.verifyDiscoverText(), "Discover");
		
	}
	
	@Test(priority=2)
	public void searchTest() {
		
		discoverPage.searchUsingDiscover();

	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();		

	}

}
