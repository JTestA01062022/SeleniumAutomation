package com.qe.test.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    WebDriver ldriver;


    public LoginPage (WebDriver rDriver)
    {
      ldriver = rDriver;

      PageFactory.initElements(rDriver, this);
    }
    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement login;

    @FindBy(linkText = "Logout")
    WebElement logout;

    public void enterEmail(String emailAdd)
    {
        email.clear();

        email.sendKeys(emailAdd);
    }
    public void enterPassword(String pwd)
    {
        password.clear();

        password.sendKeys(pwd);
    }
    public void clickOnlogin()
    {
        login.click();
    }
    public void clickOnlogout()
    {
        logout.click();
    }


}
