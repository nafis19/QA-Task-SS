package com.komoot.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.komoot.qa.base.TestBase;

public class ProfilePage extends TestBase {
	
	//Page Factory
		@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[2]/div/div/div[2]/div[3]/div[2]/a/div/span/div/div")
		WebElement profileTab;
	
		@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div/div/ul[1]/li/a")
		WebElement profileMenu;

		@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div/div/div[1]/div/div/div/div/div[2]/ul/li[2]/div/a/span[1]")
		WebElement tours;
	
		@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div/div/div[1]/div/div/div/div/div[2]/ul/li[2]/div/a[1]/span[2]")
		WebElement tourNumber;
	
		@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[2]/div/div/div[2]/div[3]/div[3]/a/div/span")
		WebElement settingsBtn;

		@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[2]/div/div/div[2]/div[3]/div[3]/div/div/ul[2]/li[4]/a")
		WebElement logout;
		
		
		
		//*[@id="pageMountNode"]/div/div[3]/div/div/div[1]/div/div/div/div/div[2]/ul/li[2]/div/a/span[1]
		
		public ProfilePage() {
			
			PageFactory.initElements(driver, this);
		}
		
		
		public ProfilePage checkNumberOfTours() {
		
			profileMenu.click();
			tours.click();
			tourNumber.getText();
		
			return new ProfilePage();
			
		}
		
		public ProfilePage logout() {
			
			settingsBtn.click();
			logout.click();
			
			return new ProfilePage();
		}
		
		public ProfilePage clickOnProfileTab() {
			
			profileTab.click();
			return new ProfilePage();
			
	}
	
	
}
