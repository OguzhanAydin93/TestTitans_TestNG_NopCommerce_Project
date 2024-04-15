package NopCommerce_Project;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static Utility.BaseDriver.driver;

public class Asli_POM {

    public Asli_POM() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Log in")
    public WebElement loginButton;
    @FindBy(css = "[name='Email']")
    public WebElement email;

    @FindBy(css = "[class='password']")
    public WebElement password;

    @FindBy(css = "[class='button-1 login-button']")
    public WebElement loggedIn;


    @FindBy(css = "[href='/gift-cards']")
    public WebElement giftcards;


    @FindBy(css = "[data-productid='43']")
    public WebElement urun1;


    @FindBy(css = "[class='item-grid']")
    public List<WebElement> item;


    @FindBy(css = "[class='recipient-name']")
    public WebElement recName;

    @FindBy(css = "[class='recipient-email']")
    public WebElement recEmail;

    @FindBy(css = "[class='sender-name']")
    public WebElement sender;

    @FindBy(css = "[class='sender-email']")
    public WebElement senderEmail;

    @FindBy(css = "[class='button-1 add-to-cart-button']")
    public WebElement add;

    @FindBy(css = "[class='content']")
    public WebElement msg;


    public void login() {
        driver.navigate().to("https://demo.nopcommerce.com/");
        BaseDriver baseDriver = new BaseDriver();
        baseDriver.myClick(loginButton);
        baseDriver.mySendKeys(email, "techno+1@gmail.com");
        baseDriver.mySendKeys(password, "123456");
        baseDriver.myClick(loginButton);

    }
}



