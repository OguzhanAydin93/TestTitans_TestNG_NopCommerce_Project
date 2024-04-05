package NopCommerce_Project;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utility.BaseDriver.driver;

public class Hatun_POM {
    public Hatun_POM() {
        PageFactory.initElements(BaseDriver.driver, this);
    }


    @FindBy(css = "[class='ico-login']")
    public WebElement loginBtn;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;

    @FindBy(css = "[class='button-1 login-button']")
    public WebElement loginButton;

    // alert danger elementi eklendi.
    @FindBy(xpath = "//div[contains(@class, 'alert-danger')]")
    public WebElement alertDanger;
    @FindBy(id = "loginAccount")
    public WebElement loginAccount;

    // logout elementi eklendi
    @FindBy (css = "[class='ico-logout']")
    public WebElement logOut;

    @FindBy (css = "[id='Email-error']")
    public WebElement alert1;

    @FindBy (css = "[class='ico-account']")
    public WebElement confirmLogin;


    public void login() {
        driver.navigate().to("https://demo.nopcommerce.com/");
        BaseDriver baseDriver = new BaseDriver();
        baseDriver.myClick(loginBtn);
        baseDriver.mySendKeys(email, "hatunyuksel.106@gmail.com");
        baseDriver.mySendKeys(password, "çaykuruüzüm");
        baseDriver.myClick(loginButton);


    }
}
