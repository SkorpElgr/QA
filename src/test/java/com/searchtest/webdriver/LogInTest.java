package com.searchtest.webdriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class LogInTest extends LogInPage{

//    @Test
//    public void myFirstTest() {
//        driver.navigate().to("https://www.google.com.ua");
//        Assert.assertTrue("https://www.google.com.ua", driver.getCurrentUrl().contains("google.com.ua"));
//        driver.findElement(By.name("q")).sendKeys("webdriver");
//        driver.findElement(By.name("btnG")).click();
//        wait.until(titleIs("webdriver - Пошук Google"));
//    }
    @Test
    public void UatLoginTest() {
        driver.navigate().to("https://app-uat.wirexapp.com");
        logInNameInput.sendKeys("testuser@wirexapp.com");
        logInPasswordInput.sendKeys("testuser");

    }

}


