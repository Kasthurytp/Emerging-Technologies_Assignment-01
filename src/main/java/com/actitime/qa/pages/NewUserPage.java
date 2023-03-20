package com.actitime.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.qa.base.TestBase;

public class NewUserPage extends TestBase{
	
	Logger log = Logger.getLogger(NewUserPage.class);
	
	//Page Factory - Object Repository
	
	 @FindBy(xpath = "//*[@id=\"createUserPanel_firstNameField\"]")
	  WebElement firstNameInput;

	  @FindBy(xpath = "//*[@id=\"createUserPanel_lastNameField\"]")
	  WebElement lastNameInput;

	  @FindBy(xpath = "//*[@id=\"createUserPanel_emailField\"]")
	  WebElement emailInput;

	  @FindBy(xpath = "//*[@id=\"createUserPanel\"]/div[3]/div/div[3]/div[1]")
	  WebElement createUserButton;

	//initialization
	
	public NewUserPage() {	
		PageFactory.initElements(driver, this);	
	}
	
	//Action/Methods

	public void createNewUser(String fname, String lname, String email) {
		firstNameInput.sendKeys(fname);
		lastNameInput.sendKeys(lname);
		emailInput.sendKeys(email);
		createUserButton.click();
	}
	
}
