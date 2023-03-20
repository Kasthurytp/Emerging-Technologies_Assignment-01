package com.actitime.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.UsersPage;

public class UsersPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	UsersPage usersPage;
	
	public UsersPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		usersPage = homePage.clickOnUserLink();
	}
	
	@Test(priority = 1)
	public void newUserLinkTest() {
		
		usersPage.clickOnNewUser();
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	

}
