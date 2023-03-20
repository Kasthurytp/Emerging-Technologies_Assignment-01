package com.actitime.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	
	WebDriver driver = null;
	
	@Given("admin is on login page")
	public void admin_is_on_login_page() {
	    System.out.println("step 01 - admin_is_on_login_page");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atchu\\eclipse-workspace\\actitime-cucumber\\src\\main\\resources\\Chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    //driver.manage().window.maximize();
	    
	    driver.navigate().to("https://demo.actitime.com/login.do");
	}

	@When("admin enters username and password")
	public void admin_enters_username_and_password() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("admin is navigated to the home page")
	public void admin_is_navigated_to_the_home_page() {
		driver.findElement(By.id("logoutLink")).isDisplayed();
	}

	@And("admin clicks on users tab")
	public void admin_clicks_on_users_tab() {
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[6]/a")).click();
	}

	@And("clciks on New User button")
	public void clciks_on_New_User_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"pageBody\"]/tbody/tr[1]/td[3]/div/div[3]/div[1]")).click();
		Thread.sleep(5000);
	}

	@And("enters users firstname, lastname, email")
	public void enters_users_firstname_lastname_email() throws InterruptedException {
		driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("Achu");
		driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys("Kasthu");
		driver.findElement(By.id("createUserPanel_emailField")).sendKeys("AchuKasthu@gmail.com");
		Thread.sleep(1000);
	}

	@And("clicks on Save & Send Invition button")
	public void clicks_on_Save_Send_Invition_button() {
		driver.findElement(By.xpath("//*[@id=\"createUserPanel\"]/div[3]/div/div[3]/div[1]")).click();
	}

	@And("view sucessfull meaage for user cretion")
	public void view_sucessfull_meaage_for_user_cretion() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"createUserPanel\"]/div[2]/div[1]/div[2]")).isDisplayed();
		Thread.sleep(3000);
	}

	@And("Clicks on Close button")
	public void clicks_on_Close_button() {
		driver.findElement(By.xpath("//*[@id=\"createUserPanel\"]/div[2]/div[1]/div[5]/span")).click();
	}

	@And("navigate to users page")
	public void navigate_to_users_page() {
		driver.findElement(By.xpath("//*[@id=\"pageBody\"]/tbody/tr[1]/td[1]/div/span")).isDisplayed();
		driver.close();
		driver.quit();
	}
}
