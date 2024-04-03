package NopCommerce_Project;


import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;

public class Mert_POM {public Mert_POM()    {PageFactory.initElements(BaseDriver.driver,this);}





    @FindBy (css = "[class='ico-login']")
    public WebElement loginButton;

    @FindBy (css = "[placeholder='Search store']")
    public WebElement searchBox;

    @FindBy (css = "[class='button-1 search-box-button']")
    public WebElement searchButton;

    @FindBy (xpath = "//h2[@class='product-title']//a")
    public WebElement productTitle;

    @FindBy (css = "[name='Email']")
    public WebElement mailInput;

    @FindBy (css = "[name='Password']")
    public WebElement passwordInput;

    @FindBy (css = "[class='button-1 login-button']")
    public WebElement logIn;

    @FindBy (xpath = "//h1[text()='Adobe Photoshop CS4']")
    public WebElement text;


}
