package com.actitime.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.NewUserPage;
import com.actitime.qa.pages.UsersPage;

public class NewUserPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	UsersPage usersPage;
	NewUserPage newUserPage;
	
	public NewUserPageTest() {
		super();
	}
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		usersPage = homePage.clickOnUserLink();
		newUserPage = usersPage.clickOnNewUser();
	}
	
	
	@Test(priority = 1)
	public void validateCreateNewUser() throws Exception{
		Thread.sleep(500);
		newUserPage.createNewUser("Achu", "Kasthu", "AchuKasthu@gmail.com");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
