package com.searchtest.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Admin on 11.09.2016.
 */

public class InitTest {
    @Test
    public void initWebdriver(){
        System.setProperty("webdriver.chrome.driver", "Y:\\Git\\QA\\drivers\\chromedriver2_24.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com.ua");
        Assert.assertTrue("https://www.google.com.ua/", driver.getCurrentUrl().contains("google.com.ua"));
    }
}
