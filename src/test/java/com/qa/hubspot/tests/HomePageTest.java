package com.qa.hubspot.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.pages.HomePage;
import com.qa.hubspot.pages.LoginPage;

public class HomePageTest extends BaseTest{

	@Test
	public void homePageTitleTest() {
		page.getInstance(LoginPage.class).doLogin("azgharsalar@gmail.com", "Salar@123");
		String title = page.getInstance(HomePage.class).getHomePageTitle();
		System.out.println("Home page title is: "+title);
		Assert.assertEquals(title, "Dashboard Library");
	}
	
	@Test
	public void verifyHomePageHeaderTest() {
		page.getInstance(LoginPage.class).doLogin("azgharsalar@gmail.com", "Salar@123");
		String header = page.getInstance(HomePage.class).getHomePageHeader();
		System.out.println("Home page header is: " + header);
		Assert.assertEquals(header, "Dashboard Library");
	}
	
}
