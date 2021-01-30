package com.komoot.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.komoot.qa.base.TestBase;
import com.komoot.qa.pages.StartPage;


public class StartPageTest extends TestBase {

	StartPage startPage;
	
	public StartPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		startPage = new StartPage();
		
	}
	
	
	@Test
	public void takeToSignUpPage() {
		startPage.takeToSignUpPage();
		String text = startPage.verifyPage();
		System.out.println(text);
		Assert.assertEquals(text, "Create a new account or log in to an existing one.");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();		
	}
}
