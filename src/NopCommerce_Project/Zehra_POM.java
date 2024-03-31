package NopCommerce_Project;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zehra_POM {
    public Zehra_POM() {
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(xpath = "//a[@class='ico-login']")
    public WebElement loginButton;
    @FindBy(css = "[class='email valid']")
    public WebElement email;
    @FindBy(css = "[class='password valid']")
    public WebElement password;

}