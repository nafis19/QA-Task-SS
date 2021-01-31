package com.komoot.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.komoot.qa.base.TestBase;

public class DiscoverPage extends TestBase {
	
	//Page Factory
		@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[2]/div/div/div[1]/ul/li[1]/a")
		WebElement discoverText;
	
		@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[1]/div/div/div[1]/div[1]/div/div/div[1]/ul/li[2]/div/div/div[2]/span")
		WebElement selectBike;
	
		@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[1]/div/div/div[1]/div[1]/div/div/div[2]/div/div[2]/div/div[1]/div/form/input")
		WebElement whereToTextBox;
	
		@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[1]/div/div/div[1]/div[1]/div/div/div[2]/div/div[2]/div/div[2]/button/span")
		WebElement searchBtn;

		@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[2]/div/div/div[1]/ul/li[2]/a")
		WebElement routeText;
		
		@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[2]/div/div/div[2]/div[3]/div[2]/a/div/span/div/div")
		WebElement profileTab;
		
		
		
		public DiscoverPage() {
			
			PageFactory.initElements(driver, this);
		}
		
		public String verifyDiscoverText() {
			
			return discoverText.getText();
		}
		
		public DiscoverPage searchUsingDiscover() {
		
			selectBike.click();
			whereToTextBox.click();
			whereToTextBox.sendKeys("Berlin");
			searchBtn.click();
		
			return new DiscoverPage();
			
		}

			public RoutePlanPage clickOnRoutePlanPage() {
				
				routeText.click();
				return new RoutePlanPage();
				
		}

			public ProfilePage clickOnProfileTab() {
				
				profileTab.click();
				return new ProfilePage();
				
		}
}
		
