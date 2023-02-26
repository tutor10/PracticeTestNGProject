package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuPage {
    public HerokuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@id='email']")
    public WebElement email;
    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Log In']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[@class='alert alert-danger']")
    public WebElement yazi;


}