package com.QA.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.QA.hubspot.BaseLayer.BasePage;

public class HomePage extends BasePage {
	
	private WebDriver driver;

	private By header= By.cssSelector("h1.private-header_heading");
	private By settingIcon= By.id("navSetting");
	private By accountName= By.className("account-name");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public String getHeaderValue() {
		if(driver.findElement(header).isDisplayed()) {
			return driver.findElement(header).getText();
		}
		return null;
		
	}
	
	public boolean isSettingsIconExist() {
		//driver.findElement(settingIcon).isDisplayed();
		if (driver.findElements(settingIcon).size()>0) {
			return true;
		}
		return false;
	}
	
	
	public String getAccountName() {
		if(driver.findElement(accountName).isDisplayed()) {
			return driver.findElement(accountName).getText();
		}
		return null;
	}
	
	
	
	
	
	
	
}
