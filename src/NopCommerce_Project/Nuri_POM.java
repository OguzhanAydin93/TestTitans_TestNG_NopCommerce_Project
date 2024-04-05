package NopCommerce_Project;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nuri_POM {
    public Nuri_POM() {
        PageFactory.initElements(BaseDriver.driver,this);}

    @FindBy(css = ".ico-register")
    public WebElement register;

    @FindBy(css = "[for='gender-male']")
    public WebElement gender;

    @FindBy(xpath = "//input[@id='FirstName']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@id='LastName']")
    public WebElement lastname;

    @FindBy(css = "[name='DateOfBirthDay']")
    public WebElement day;

    @FindBy(css = "[name='DateOfBirthMonth']")
    public WebElement month;

    @FindBy(css = "[name='DateOfBirthYear']")
    public WebElement year;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='Company']")
    public WebElement companyname;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmpassword;

    @FindBy(xpath = "//button[@id='register-button']")
    public WebElement registerButton;

}
