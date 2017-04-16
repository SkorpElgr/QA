package com.searchtest.webdriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * Created by PS on 4/4/2017.
 */
public class TestBaseMain {
    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    public WebDriver driver;
    public WebDriverWait wait;
    public String browserName;

    @Before
    public void start() {
        browserName = "Chrome";
        if (tlDriver.get() != null) {
            driver = tlDriver.get();
            wait = new WebDriverWait(driver, 10);
            return;
        }
        DesiredCapabilities caps = new DesiredCapabilities();
        switch (browserName) {
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver2_28.exe");
                caps.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
                driver = new ChromeDriver(caps);
                tlDriver.set(driver);
                wait = new WebDriverWait(driver, 10);
                break;
//            case "Firefox":
//                caps.setCapability(FirefoxDriver.MARIONETTE, false)
//                driver = new FirefoxDriver(caps);
//                break;
//            case "IE":
//                System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
//                caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//                caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
//                driver = new InternetExplorerDriver(caps);
//                break;
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().setSize(new Dimension(1280,1024));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 20);
        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> { driver.quit(); driver = null; }));

    }

    @After
    public void stop() {
//        driver.quit();
//        driver = null;
    }
}

