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

    @FindBy(linkText = "Computers ")
    public WebElement computers;

    @FindBy(linkText = "Desktops ")
    public WebElement desktops ;

    @FindBy(linkText = "Notebooks ")
    public WebElement notebooks;

    @FindBy(linkText = "Software ")
    public WebElement software;




}
