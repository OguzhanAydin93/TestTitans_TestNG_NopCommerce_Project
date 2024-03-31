package NopCommerce_Project;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static Utility.BaseDriver.driver;

public class Zehra_POM {
    public Zehra_POM() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[@class='ico-login']")
    public WebElement loginButton;
    @FindBy(css = "[id='Email']")
    public WebElement email;
    @FindBy(css = "[id='Password']")
    public WebElement password;
    @FindBy(css = "[class='button-1 login-button']")
    public WebElement submitLogin;
    @FindBy(css = "[class='header-menu']")
    public List<WebElement> tabMenu;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a[1]")
    public WebElement computers;
    @FindBy(xpath = "//ul[@class='sublist first-level']/li/a[1]")
    public WebElement dekstops;
    @FindBy(xpath = "//h2[@class='product-title']/a[1]")
    public WebElement buildComp;
    @FindBy(css = "[name='product_attribute_2']")
    public WebElement rams;
    @FindBy(xpath = "//input[@name='product_attribute_3']")
    public List<WebElement> hdd;
    @FindBy(xpath = "//*[text()='Add to cart']")
    public WebElement addToCard;
    @FindBy(css = "[class='content']")
    public WebElement addedMsg;

    public void login() {
        driver.navigate().to("https://demo.nopcommerce.com/");
        BaseDriver baseDriver = new BaseDriver();
        baseDriver.myClick(loginButton);
        BaseDriver.wait.until(ExpectedConditions.urlContains("login"));
        baseDriver.mySendKeys(email, "techno+1@gmail.com");
        baseDriver.mySendKeys(password, "123456");
        baseDriver.myClick(submitLogin);
        BaseDriver.wait.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/"));

    }
    public void ramSelect(){
        BaseDriver baseDriver = new BaseDriver();
        Select ramMenu=new Select(rams);
        for (WebElement ram : ramMenu.getOptions()) {
            baseDriver.myClick(ram);
            System.out.println(ram.getText());
        }

    }
    public void hddSelect(){
        BaseDriver baseDriver = new BaseDriver();
        int rndmHdd = (int) (Math.random() * hdd.size());
        WebElement hdds=hdd.get(rndmHdd);
        System.out.println(hdds.getText());
        baseDriver.myClick(hdds);


    }

}
