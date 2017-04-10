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
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

@Title("Init Allure test suite class")
public class InitTest extends TestBaseMain {
    @Severity(SeverityLevel.BLOCKER)
    @Title("Init Allure test")
    @Description("Just to make sure allure works)")
    @Test
    public void myFirstTest() {
        driver.navigate().to("https://www.google.com.ua");
        Assert.assertTrue("https://www.google.com.ua", driver.getCurrentUrl().contains("google.com.ua"));
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnG")).click();
        wait.until(titleIs("webdriver - Google Search"));
    }

}


