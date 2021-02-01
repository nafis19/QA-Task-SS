/*
 * Author: Md Nafis Rahman
 */

package com.komoot.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.komoot.qa.base.TestBase;

public class StartPage extends TestBase {

	//Page Factory
	@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[1]/div/div/div[2]/div[4]/div/button")
	WebElement SignUpOrLoginBtn;
	
	@FindBy(xpath = "//*[@id=\"gdpr_banner_portal\"]/div/div/div/div[2]/div/div[1]/button/div/div")
	WebElement AcceptBtn;
	
	@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div/div[1]/div/div/div[2]/div/div[1]/form/div[2]/p")
	WebElement PageText;
	
	
	public StartPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public SignUpPage takeToSignUpPage() {
		
		AcceptBtn.click();
		SignUpOrLoginBtn.click();
		
		return new SignUpPage();
	}
	
	public String verifyPage() {
		
		return PageText.getText();
	}
}
