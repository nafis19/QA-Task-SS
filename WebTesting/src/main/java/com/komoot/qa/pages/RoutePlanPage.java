package com.komoot.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.komoot.qa.base.TestBase;

public class RoutePlanPage extends TestBase {
	
	public static WebDriverWait wait;
	
	//Page Factory
			@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[2]/div/div/div[1]/ul/li[2]/a")
			WebElement routeText;

			@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[3]/div[1]/div/div[1]/div/div/div[1]/div/form/input")
			WebElement searchTextBox01;
			
			@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[3]/div[1]/div/div[1]/div/div/div[1]/div/form/input")
			WebElement searchTextBox02;
			
			@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[3]/div[1]/div/div[1]/div/div/div[1]/div/form/input")
			WebElement searchTextBox03;
			
			@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[3]/div[1]/div/div[1]/div/div/div[1]/div/form/input")
			WebElement searchTextBox04;
			
			@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[3]/div[1]/div/div[1]/div/div/div[1]/div/form/input")
			WebElement searchTextBox05;
			
			@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[3]/div[1]/div/div[1]/div/div/div[1]/div/form/input")
			WebElement searchTextBox06;
	
			@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[3]/div[1]/div/div[2]/div[2]/div/div/div[3]/div[1]/div[1]/button/div/div")
			WebElement setAsDestBtn;
	
			@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[3]/div[1]/div/div[2]/div[2]/div/div/div[3]/div[1]/div/button/div/div")
			WebElement startHereBtn;
	
			@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[3]/div[1]/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div/button/div[1]/h3/div/div[1]/span")
			WebElement sportIcon;
			
			@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[3]/div[1]/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div[1]/ul/li[3]/button/div/span")
			WebElement bikeTourBtn;
	
			@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[2]/div[3]/div/button/span")
			WebElement saveBtn;

			@FindBy(xpath = "/html/body/div[9]/div/div/div/div/div/div/div/div[2]/div/div/button/div/div")
			WebElement gotItBtn;
	
			@FindBy(xpath = "//*[@id=\"pageMountNode\"]/div/div[3]/div[3]/div[1]/div/div[2]/div[2]/div/div/ul/li[1]/div/div[2]/div")
			WebElement cityName;
		
			
			public RoutePlanPage() {
		
				wait = new WebDriverWait(driver, 15, 50);
				PageFactory.initElements(driver, this);
			}
			
			Actions actions = new Actions(driver);
			
			public String verifyRoutePlanText() {
				
				routeText.click();
				
				return routeText.getText();
			}
			
			//@SuppressWarnings("deprecation")
			public RoutePlanPage planRoute() {
			
				//routeText.click();
				//searchTextBox01.click();
			
				searchTextBox01.sendKeys("Berlin");
				wait.until(ExpectedConditions.visibilityOf(cityName)).click();
				setAsDestBtn.click();
	
				searchTextBox05.sendKeys("Potsdam");
				wait.until(ExpectedConditions.visibilityOf(cityName)).click();
				startHereBtn.click();
				
				sportIcon.click();
				bikeTourBtn.click();
				saveBtn.click();
		
			
				return new RoutePlanPage();
				
			}
	
	
}