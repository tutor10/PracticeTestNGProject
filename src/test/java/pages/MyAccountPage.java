package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class MyAccountPage {
    public MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[@class='page-title']")
    public WebElement myAccountText;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "(//*[@name='password'])[1]")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement singInButton;

    @FindBy(xpath = "(//*[text()='Account details'])[1]")
    public WebElement accountDetailsButton;

    @FindBy(xpath = "//*[@name='account_first_name']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//*[@name='account_last_name']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//*[@name='account_display_name']")
    public WebElement displayNameBox;

    @FindBy(id = "tinymce")
    public WebElement descriptionBox;

    @FindBy(xpath = "//*[@name='account_email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='password_current']")
    public WebElement currentPasswordBox;

    @FindBy(xpath = "//input[@id='password_1']")
    public WebElement changePasswordButton;

    @FindBy(xpath = "//input[@id='password_2']")
    public WebElement confirmChangePasswordButton;

    @FindBy(xpath = "//button[@name='save_account_details']")
    public WebElement saveChangesButton;

    @FindBy(css = "div[role='alert']")
    public WebElement alertBox;



}