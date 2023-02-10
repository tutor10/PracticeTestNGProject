package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllureToYouHomePage;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;


public class US05TestCase01 {

    @Test
    public void US05_TC01() throws InterruptedException {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        MyAccountPage myAccountPage = new MyAccountPage();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));
        Thread.sleep(3000);

        allureToYouHomePage.myAccountButton.click();
        Assert.assertTrue(myAccountPage.myAccountText.isDisplayed());
        //Thread.sleep(2000);


        myAccountPage.usernameBox.sendKeys(ConfigReader.getProperty("email"));
        //Thread.sleep(2000);

        myAccountPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        //Thread.sleep(2000);

        myAccountPage.singInButton.submit();
        //Thread.sleep(2000);

        myAccountPage.accountDetailsButton.click();


        myAccountPage.firstNameBox.clear();
        myAccountPage.firstNameBox.sendKeys(ConfigReader.getProperty("firstName"));
        myAccountPage.lastNameBox.clear();
        myAccountPage.lastNameBox.sendKeys(ConfigReader.getProperty("lastName"));
        Thread.sleep(2000);

        myAccountPage.displayNameBox.clear();

        myAccountPage.displayNameBox.sendKeys(ConfigReader.getProperty("displayName"));
        Thread.sleep(2000);


        myAccountPage.emailBox.clear();
        myAccountPage.emailBox.sendKeys(ConfigReader.getProperty("email"));


        Driver.getDriver().switchTo().frame(0);
        myAccountPage.descriptionBox.clear();
        myAccountPage.descriptionBox.sendKeys(ConfigReader.getProperty("description"));
        Thread.sleep(2000);

        Driver.getDriver().switchTo().defaultContent();

        Thread.sleep(2000);


        myAccountPage.currentPasswordBox.sendKeys(ConfigReader.getProperty("password"));
        myAccountPage.changePasswordButton.sendKeys(ConfigReader.getProperty("password2"));
        myAccountPage.confirmChangePasswordButton.sendKeys(ConfigReader.getProperty("password2"));

        myAccountPage.saveChangesButton.submit();
        Assert.assertEquals(myAccountPage.alertBox.getText(), "Account details changed successfully.");


    }
}