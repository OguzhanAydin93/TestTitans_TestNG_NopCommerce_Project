package NopCommerce_Project;


import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mert_POM {
    public Mert_POM() {PageFactory.initElements(BaseDriver.driver,this);}

    @FindBy (css = "[class='ico-login']")
    public WebElement loginButton;

    @FindBy (css = "[placeholder='Search store']")
    public WebElement searchBox;

    @FindBy (css = "[class='button-1 search-box-button']")
    public WebElement searchButton;

    @FindBy (xpath = "//h2[@class='product-title']//a")
    public WebElement productTitle;
}
