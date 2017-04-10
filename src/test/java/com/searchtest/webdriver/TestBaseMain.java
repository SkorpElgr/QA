package com.searchtest.webdriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by PS on 4/4/2017.
 */
public class TestBaseMain {
    public WebDriver driver;
    public WebDriverWait wait;
    protected LogInPage

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver2_28.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 20);
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

    public static logInAs() {

    }


}
