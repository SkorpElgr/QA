package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by PS on 4/18/2017.
 */
public class LogInPage extends Page {

    @FindBy(xpath = "//div[@class='b-input-b']/input[@name='username']")
    public WebElement emailInput;

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage(){
        System.out.println(Name.TestEnvUrl.getFromProperty());
        driver.get(Name.TestEnvUrl.getFromProperty());

    }
}
