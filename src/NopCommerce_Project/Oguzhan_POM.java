package NopCommerce_Project;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/a")
    public WebElement computers;

    @FindBy(linkText = "Desktops ")
    public WebElement desktops ;

    @FindBy(linkText = "Notebooks ")
    public WebElement notebooks;

    @FindBy(linkText = "Software ")
    public WebElement software;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]/a")
    public WebElement electronics;

    @FindBy(linkText = "Camera & photo ")
    public WebElement cameraAndPhoto;

    @FindBy(linkText = "Cell phones ")
    public WebElement cellPhone;

    @FindBy(linkText = "Others ")
    public WebElement others;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/a")
    public WebElement apparel;

    @FindBy(linkText = "Shoes ")
    public WebElement shoes;

    @FindBy(linkText = "Clothing ")
    public WebElement clothing;

    @FindBy(linkText = "Accessories ")
    public WebElement accessories;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[4]/a")
    public WebElement digitalDownload;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[5]/a")
    public WebElement books;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[6]/a")
    public WebElement jewelry;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[7]/a")
    public WebElement giftCards;

    @FindBy(css = "//div[@class='page-title']/h1")
    public WebElement pageText;












}
