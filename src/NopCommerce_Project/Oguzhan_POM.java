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

    @FindBy(linkText = "Computers ")
    public WebElement computers;


    @FindBy(linkText = "Desktops ")
    public WebElement desktops ;

    @FindBy(linkText = "Notebooks ")
    public WebElement notebooks;

    @FindBy(linkText = "Software ")
    public WebElement software;

    @FindBy(linkText = "Electronics ")
    public WebElement electronics;

    @FindBy(linkText = "Camera & photo ")
    public WebElement cameraAndPhoto;

    @FindBy(linkText = "Cell phones ")
    public WebElement cellPhone;

    @FindBy(linkText = "Others ")
    public WebElement others;

    @FindBy(linkText = "Apparel ")
    public WebElement apparel;

    @FindBy(linkText = "Shoes ")
    public WebElement shoes;

    @FindBy(linkText = "Clothing ")
    public WebElement clothing;

    @FindBy(linkText = "Accessories ")
    public WebElement accessories;

    @FindBy(linkText = "Digital downloads ")
    public WebElement digitalDownload;

    @FindBy(linkText = "Books ")
    public WebElement books;

    @FindBy(linkText = "Jewelry ")
    public WebElement jewelry;

    @FindBy(linkText = "Gift Cards ")
    public WebElement giftCards;

    @FindBy(css = "//div[@class='page-title']/h1")
    public WebElement pageText;












}
