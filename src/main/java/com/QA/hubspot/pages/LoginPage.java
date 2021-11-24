package com.QA.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.QA.hubspot.BaseLayer.BasePage;

public class LoginPage extends BasePage{
     
	private WebDriver driver;
	
	//1. By Locators: OR
	
	private By emailId= By.id("username");
	private By password= By.id("password");
	private By loginButton= By.id("loginBtn");
	private By signUpLink= By.linkText("Sign up");
	
	//2. Constructor of the page class
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		
	}
	//3. Page actions: features/behavior of the page interms of methods
	
	public String getLoginPageTitle() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return driver.getTitle();
		
	}
	
	public boolean issignUpLinkExist()
	{
		return driver.findElement(signUpLink).isDisplayed();
	}
	
	public HomePage doLogin(String un, String pwd) {
		System.out.println("Login with : " + un + " and " + pwd);
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
		return new HomePage(driver);
		
		
		
		
	}
	
	
	
}
