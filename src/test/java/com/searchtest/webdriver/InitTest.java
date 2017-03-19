package com.searchtest.webdriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class InitTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver2_24.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

    @Test
    public void googleTest() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com.ua");
        Assert.assertTrue("https://www.google.com.ua", driver.getCurrentUrl().contains("google.com.ua"));
    }

    @Test
    public void myFirstTest() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnG")).click();
        wait.until(titleIs("webdriver - Пошук Google"));
    }

}


