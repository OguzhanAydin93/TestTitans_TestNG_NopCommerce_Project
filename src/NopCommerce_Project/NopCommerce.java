package NopCommerce_Project;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class NopCommerce extends BaseDriver {

    @Test
    public void US_501_Nuri(){
        BaseDriver.driver.navigate().to("https://demo.nopcommerce.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        Nuri_POM elements = new Nuri_POM();

        wait.until(ExpectedConditions.elementToBeClickable(elements.register));
        elements.register.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.gender));
        elements.gender.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.firstname));
        elements.firstname.sendKeys("Teamtitans");
        wait.until(ExpectedConditions.elementToBeClickable(elements.lastname));
        elements.lastname.sendKeys("Techno123");
        Select day = new Select(elements.day);
        day.selectByIndex(5);
        Select month = new Select(elements.month);
        month.selectByValue("5");
        Select year = new Select(elements.year);
        year.selectByIndex(1);
        wait.until(ExpectedConditions.elementToBeClickable(elements.email));
        elements.email.sendKeys("techno+1@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(elements.companyname));
        elements.companyname.sendKeys("TestTitans");
        wait.until(ExpectedConditions.elementToBeClickable(elements.password));
        elements.password.sendKeys("123456");
        wait.until(ExpectedConditions.elementToBeClickable(elements.confirmpassword));
        elements.confirmpassword.sendKeys("123456");
        wait.until(ExpectedConditions.elementToBeClickable(elements.registerButton));
        elements.registerButton.click();

    }

    @Test
    public void US_504_Oguzhan(){

        Oguzhan_POM oguzhanPom=new Oguzhan_POM();


    }


}
