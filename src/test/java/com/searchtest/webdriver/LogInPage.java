package com.searchtest.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends TestBaseMain{

    /**
     * Имя пользователя
     */

    @FindBy(xpath = "//input[@name='username']")
    public WebElement logInNameInput;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement logInPasswordInput;

    public void LogIn(String Name){

    }

}