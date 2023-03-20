package com.actitime.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.base.TestBase;

public class UsersPage extends TestBase  {
	
	Logger log = Logger.getLogger(UsersPage.class);
	
	//Page Factory - Object Repository
	
	@FindBy(xpath = "//div[@class='components_button_label']")
	WebElement newUser;
	
	public UsersPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Action/Methods
	
	
	public NewUserPage clickOnNewUser() {
		
		newUser.click();
		return new NewUserPage();
	}
}
