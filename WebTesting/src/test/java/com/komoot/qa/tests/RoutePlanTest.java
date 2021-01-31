package com.komoot.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.komoot.qa.base.TestBase;
import com.komoot.qa.pages.DiscoverPage;
import com.komoot.qa.pages.RoutePlanPage;
import com.komoot.qa.pages.SignInPage;
import com.komoot.qa.pages.SignUpPage;
import com.komoot.qa.pages.StartPage;

public class RoutePlanTest extends TestBase{
	
	StartPage startPage;
	SignUpPage signUpPage;
	SignInPage signInPage;
	DiscoverPage discoverPage;
	RoutePlanPage routePlanPage;
	
	public RoutePlanTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		startPage = new StartPage();
		routePlanPage = new RoutePlanPage();
		signInPage = new SignInPage();
		discoverPage = new DiscoverPage();
		signUpPage = startPage.takeToSignUpPage();
		discoverPage = signInPage.userSignIn(prop.getProperty("email"), prop.getProperty("password"));
		routePlanPage = discoverPage.clickOnRoutePlanPage();
		
	}
	
	
	@Test(priority=1)
	public void verifyRoutePlanTextTest() {
		
		Assert.assertEquals(routePlanPage.verifyRoutePlanText(), "Route planner");
		
	}
	
	@Test(priority=2)
	public void planRouteTest() {
		
		routePlanPage.planRoute();

	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();		

	}


}
