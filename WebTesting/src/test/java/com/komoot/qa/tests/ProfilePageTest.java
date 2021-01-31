package com.komoot.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.komoot.qa.base.TestBase;
import com.komoot.qa.pages.DiscoverPage;
import com.komoot.qa.pages.ProfilePage;
import com.komoot.qa.pages.RoutePlanPage;
import com.komoot.qa.pages.SignInPage;
import com.komoot.qa.pages.SignUpPage;
import com.komoot.qa.pages.StartPage;

public class ProfilePageTest extends TestBase {
	
	StartPage startPage;
	SignUpPage signUpPage;
	SignInPage signInPage;
	DiscoverPage discoverPage;
	RoutePlanPage routePlanPage;
	ProfilePage profilePage;
	
	public ProfilePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		startPage = new StartPage();
		signInPage = new SignInPage();
		discoverPage = new DiscoverPage();
		profilePage = new ProfilePage();
		signUpPage = startPage.takeToSignUpPage();
		discoverPage = signInPage.userSignIn(prop.getProperty("email"), prop.getProperty("password"));
		profilePage = discoverPage.clickOnProfileTab();

		
	}
	
	
	@Test(priority=1)
	public void verifyNumberOfToursTest() {
		
		profilePage.checkNumberOfTours();
		
	}
	
	@Test(priority=2)
	public void userLogOutTest() {
		
		profilePage.logout();

	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();		

	}


}
