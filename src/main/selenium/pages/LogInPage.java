package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by PS on 4/18/2017.
 */
public class LogInPage {
    WebDriver driver;

    public LogInPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='b-input-b']/input[@name='username']")
    public WebElement emailInput;

    @FindBy(xpath = "//div[@class='b-input-b']/input[@name='password'] ")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@class='wx-button wx-primary' and @type ='submit']")
    public WebElement logInButton;

    @FindBy(xpath = "//div[@class='auth-form__bottom']//a[contains(text(), 'Register')]")
    public WebElement registerNowLink;

    @FindBy(xpath = "//div[@class='horizontal ng-scope']//a[contains(text(), 'Register')]")
    public WebElement registerLink;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-checkmark']")
    public WebElement capchaCheckbox;

    public void openMainPage(){
        driver.get(Name.TestEnvUrl.getFromProperty()+"/log-in");
    }


}
