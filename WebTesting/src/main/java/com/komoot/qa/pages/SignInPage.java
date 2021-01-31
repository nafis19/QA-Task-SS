package com.komoot.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.komoot.qa.base.TestBase;

public class SignInPage extends TestBase {

	//Page Factory
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement EmailTextField;
	
	@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div/div[1]/div/div/div[2]/div/div[1]/form/div[4]/button/div/div[2]")
	WebElement ContinueWithEmailBtn;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement passWord;
	
	@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div/div[1]/div/div/div[2]/form/div/div[4]/button/div/div")
	WebElement loginBtn;
	
	@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[1]/div/div/div[1]/h2")
	WebElement headerText;
	
	
	public SignInPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public RoutePlanPage userSignIn(String email, String password) {
		
		EmailTextField.sendKeys(email);
		ContinueWithEmailBtn.click();
		passWord.sendKeys(password);
		loginBtn.click();
	
		return new RoutePlanPage();
	}
	
	public String verifyPage() {
		
		return headerText.getText();
	}
}
