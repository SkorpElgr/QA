package com.searchtest.webdriver;

import org.junit.Test;
import org.openqa.selenium.By;

public class LitecartLogIn extends TestBaseMain {

    @Test
    public void LitecardLogIn() {
        try {
            driver.navigate().to("http://localhost/litecart/admin/");
//            driver.findElement(By.xpath("//form[@name='login_form']//input[@type='password']"))
            driver.findElement(By.xpath("//input[@name='username']")).clear();
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
            driver.findElement(By.xpath("//input[@type='password']")).clear();
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
            driver.findElement(By.xpath("//input[@name='remember_me']")).click();
            driver.findElement(By.xpath("//button[@name='login']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
