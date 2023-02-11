package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US08_Wishlist {

    public US08_Wishlist(){

        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(xpath = "//*[@aria-label='Search']")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='add_to_wishlist single_add_to_wishlist'])[1]")
    public WebElement whishButton;

    @FindBy(xpath = "//i[@class='w-icon-heart']")
    public WebElement whishlistButton;

    @FindBy(xpath = "(//*[@title='Quick View'])[1]")
    public WebElement quickView;
    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement xButton;



    @FindBy(xpath = "(//*[text()='Add to cart'])[1]")
    public WebElement addToCart;



    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement pageTitle;

    @FindBy(css = "div[role='alert']")
    public WebElement alertBoxMessage;

    @FindBy(xpath = "//span[@class='cart-name']")
    public WebElement cartButton;

    @FindBy(xpath = "//a[@class='button wc-forward']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//a[@class='button checkout wc-forward']")
    public WebElement checkoutButton;

    @FindBy(xpath = "//a[contains(text(),'Sweatshirt Rose')]")
    public WebElement firstProductDisplayed;

    @FindBy(xpath = "//a[contains(text(),'Sweatshirt Los Angeles')]")
    public WebElement secondProductDisplayed;

    @FindBy(xpath = "//a[normalize-space()='Shopping Cart']")
    public WebElement shooppingCartPage;

    @FindBy(xpath = "//*[@class='checkout-button button alt wc-forward']")
    public WebElement proceedToCheckout;






}
