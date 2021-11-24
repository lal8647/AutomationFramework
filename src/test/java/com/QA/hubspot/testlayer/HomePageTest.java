package com.QA.hubspot.testlayer;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.QA.hubspot.BaseLayer.BaseTest;

public class HomePageTest extends BaseTest{

	@BeforeClass
	public void homePageSetup() {
		homePage= loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void homePageTitleTest() {
		String title= basePage.getHomePageTitle();
	}
}
