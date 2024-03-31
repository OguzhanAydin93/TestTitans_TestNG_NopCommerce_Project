package NopCommerce_Project;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utility.BaseDriver.driver;

public class Oguzhan_POM {

    public Oguzhan_POM(){
        PageFactory.initElements(BaseDriver.driver,this);
    }


    @FindBy(linkText = "Log in")
    public WebElement login;

    @FindBy(css = "[id='Email']")
    public WebElement email;

    @FindBy(css = "[id='Password']")
    public WebElement password;

    @FindBy(css = "[class='button-1 login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/a")
    public WebElement computers;

    @FindBy(xpath = "//ul[@class='sublist first-level']//li[1]")
    public WebElement desktops ;

    @FindBy(xpath = "//ul[@class='sublist first-level']//li[2]")
    public WebElement notebooks;

    @FindBy(xpath = "//ul[@class='sublist first-level']//li[3]")
    public WebElement software;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]/a")
    public WebElement electronics;

    @FindBy(linkText = "Camera & photo")
    public WebElement cameraAndPhoto;

    @FindBy(linkText = "Cell phones")
    public WebElement cellPhone;

    @FindBy(linkText = "Others")
    public WebElement others;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/a")
    public WebElement apparel;

    @FindBy(linkText = "Shoes")
    public WebElement shoes;

    @FindBy(linkText = "Clothing")
    public WebElement clothing;

    @FindBy(linkText = "Accessories")
    public WebElement accessories;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[4]/a")
    public WebElement digitalDownload;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[5]/a")
    public WebElement books;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[6]/a")
    public WebElement jewelry;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[7]/a")
    public WebElement giftCards;

    @FindBy(xpath = "//div[@class='page-title']/h1")
    public WebElement pageText;

    @FindBy(css = "[class='header-logo']")
    public WebElement logo;

    public void login() {
        driver.navigate().to("https://demo.nopcommerce.com/");
        BaseDriver baseDriver = new BaseDriver();
        baseDriver.myClick(login);
        baseDriver.mySendKeys(email, "techno+1@gmail.com");
        baseDriver.mySendKeys(password, "123456");
        baseDriver.myClick(loginButton);

    }












}
