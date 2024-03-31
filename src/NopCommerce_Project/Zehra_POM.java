package NopCommerce_Project;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Zehra_POM {
    public Zehra_POM() {
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(xpath = "//a[@class='ico-login']")
    public WebElement loginButton;
    @FindBy(css = "[id='Email']")
    public WebElement email;
    @FindBy(css = "[id='Password']")
    public WebElement password;
    @FindBy(css = "[class='button-1 login-button']")
    public WebElement submitLogin;

    public void Login(){
        BaseDriver baseDriver=new BaseDriver();

       baseDriver.myClick(loginButton);
       BaseDriver.wait.until(ExpectedConditions.urlContains("login"));
       baseDriver.mySendKeys(email,"techno+1@gmail.com");
       baseDriver.mySendKeys(password,"123456");
       baseDriver.myClick(submitLogin);
       BaseDriver.wait.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/"));


    }


}
