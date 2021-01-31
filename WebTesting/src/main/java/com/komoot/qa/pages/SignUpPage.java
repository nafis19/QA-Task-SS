package com.komoot.qa.pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.komoot.qa.base.TestBase;

public class SignUpPage extends TestBase{
	
	//Page Factory
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement EmailTextField;
	
	@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div/div[1]/div/div/div[2]/div/div[1]/form/div[4]/button/div/div[2]")
	WebElement ContinueWithEmailBtn;
	
	@FindBy(xpath = "//*[@id=\"display_name\"]")
	WebElement userName;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement passWord;
	
	@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div/div[1]/div/div/div[2]/form/div/div[7]/button")
	WebElement signUpBtn;

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy-HH.mm.ss");
	String date = simpleDateFormat.format(new Date());
	String useremail = "test+" + date + "@test.com";
	
	
	public SignUpPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public DiscoverPage signUp() {
		
		EmailTextField.sendKeys(useremail);
		ContinueWithEmailBtn.click();
		userName.sendKeys("John Doe111");
		passWord.sendKeys("987456321");
		signUpBtn.click();
		
		return new DiscoverPage();
		
	}
}
