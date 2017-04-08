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


public class InitTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private String browserName;

    @Before
    public void start() {
        browserName = "Chrome";
        DesiredCapabilities caps = new DesiredCapabilities();
        switch (browserName){
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver2_24.exe");
                driver = new ChromeDriver(caps);
                break;
            case "IE":
                System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
                caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                driver = new InternetExplorerDriver(caps);
                break;
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().setSize(new Dimension(1280,1024));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 20);
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

    @Test
    public void myFirstTest() {
        driver.navigate().to("https://www.google.com.ua");
        Assert.assertTrue("https://www.google.com.ua", driver.getCurrentUrl().contains("google.com.ua"));
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnG")).click();
        wait.until(titleIs("webdriver - Пошук Google"));
    }

}


