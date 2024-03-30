package NopCommerce_Project;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Oguzhan_POM {

    @FindBy(linkText = "Log in")
    public WebElement login;

    @FindBy(css = "[id='Email']")
    public WebElement email;

    @FindBy(css = "[id='Password']")
    public WebElement password;

    @FindBy(css = "[class='button-1 login-button']")
    public WebElement loginButton;


}
