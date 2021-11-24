package com.QA.hubspot.testlayer;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.QA.hubspot.BaseLayer.BaseTest;

public class LoginPageTest extends BaseTest{

	@Test(priority=1)
	
	public void verfiyLoginPageTitleTest() {
		String title= loginPage.getLoginPageTitle();
		System.out.println("login page title is : " + title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=2)
	public void verifySignUpLinkTest() {
		Assert.assertTrue(loginPage.issignUpLinkExist());
		
	}
	
	@Test(priority=3)
	public void loginTest() {
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
