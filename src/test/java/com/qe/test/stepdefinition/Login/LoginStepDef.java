package com.qe.test.stepdefinition.Login;


import com.qe.test.PageObject.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDef {

	public WebDriver driver;
	public LoginPage loginPg;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
    WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	loginPg = new LoginPage(driver);
	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) {
     driver.get(url);
	}


	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailAdd, String password) {
		loginPg.enterEmail(emailAdd);
		loginPg.enterPassword(password);
	}


	@When("Click in login")
	public void click_in_login() {
		loginPg.clickOnlogin();

	}
	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle)
	{
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

	}
	@When("User click on logout link")
	public void user_click_on_logout_link() {
     loginPg.clickOnlogout();
	}



	@Then("Close browser")
	public void close_browser() {
		driver.close();
		driver.quit();

	}







}
