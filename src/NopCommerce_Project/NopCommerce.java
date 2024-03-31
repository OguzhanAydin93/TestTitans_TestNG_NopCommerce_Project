package NopCommerce_Project;

import Utility.BaseDriver;
import com.beust.ah.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class NopCommerce extends BaseDriver {

    @Test
    public void US_501_Nuri(){
        BaseDriver.driver.navigate().to("https://demo.nopcommerce.com/");


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

        Oguzhan_POM elements=new Oguzhan_POM();

        driver.get("https://demo.nopcommerce.com/");
        Actions actions=new Actions(driver);

        myClick(elements.login);
        mySendKeys(elements.email,"techno+1@gmail.com");
        mySendKeys(elements.password,"123456");
        myClick(elements.loginButton);
        myClick(elements.computers);
        myAssert(elements.pageText,"Computers");
        myClick(elements.logo);
        actions.moveToElement(elements.computers).build().perform();
        actions.moveToElement(elements.desktops).click().perform();
        myAssert(elements.pageText,"Desktops");
        myClick(elements.logo);
        actions.moveToElement(elements.computers).build().perform();
        actions.moveToElement(elements.notebooks).click().perform();
        myAssert(elements.pageText,"Notebooks");
        myClick(elements.logo);
        actions.moveToElement(elements.computers).build().perform();
        actions.moveToElement(elements.software).click().perform();
        myAssert(elements.pageText,"Software");
        myClick(elements.logo);
        myClick(elements.electronics);
        myAssert(elements.pageText,"Electronics");
        myClick(elements.logo);
        actions.moveToElement(elements.electronics).build().perform();
        actions.moveToElement(elements.cameraAndPhoto).click().perform();
        myAssert(elements.pageText,"Camera & photo");
        myClick(elements.logo);
        actions.moveToElement(elements.electronics).build().perform();
        actions.moveToElement(elements.cellPhone).click().perform();
        myAssert(elements.pageText,"Cell phones");
        myClick(elements.logo);
        actions.moveToElement(elements.electronics).build().perform();
        actions.moveToElement(elements.others).click().perform();
        myAssert(elements.pageText,"Others");
        myClick(elements.logo);
        myClick(elements.apparel);
        myAssert(elements.pageText,"Apparel");
        myClick(elements.logo);
        actions.moveToElement(elements.apparel).build().perform();
        actions.moveToElement(elements.shoes).click().perform();
        myAssert(elements.pageText,"Shoes");
        myClick(elements.logo);
        actions.moveToElement(elements.apparel).build().perform();
        actions.moveToElement(elements.clothing).click().perform();
        myAssert(elements.pageText,"Clothing");
        myClick(elements.logo);
        actions.moveToElement(elements.apparel).build().perform();
        actions.moveToElement(elements.accessories).click().perform();
        myAssert(elements.pageText,"Accessories");
        myClick(elements.logo);
        myClick(elements.digitalDownload);
        myAssert(elements.digitalDownload,"Digital downloads");
        myClick(elements.logo);
        myClick(elements.books);
        myAssert(elements.books,"Books");
        myClick(elements.logo);
        myClick(elements.jewelry);
        myAssert(elements.jewelry,"Jewelry");
        myClick(elements.logo);
        myClick(elements.giftCards);
        myAssert(elements.giftCards,"Gift Cards");


    }

    @Test
    public void US_507_Zehra(){
        Zehra_POM elements=new Zehra_POM();
        Actions actionDriver = new Actions(driver);
        elements.login();

        for (WebElement tabMenu : elements.tabMenu) {
            System.out.println(tabMenu.getText());
            Assert.assertTrue(tabMenu.isDisplayed(), "Tab Menu görüntülenemedi.");
        }

        actionDriver.moveToElement(elements.computers).
                moveToElement(elements.dekstops).click().build().perform();
        wait.until(ExpectedConditions.urlContains("desktops"));

        myJSClick(elements.buildComp);
        elements.ramSelect();


    }

    @Test(groups = {"Smoke,Regression"})
    @Parameters("message")
    public void US_508_Mert(String inputMsg){
        Mert_POM elements=new Mert_POM();

        wait.until(ExpectedConditions.visibilityOf(elements.searchBox));
        mySendKeys(elements.searchBox,inputMsg);
        myClick(elements.searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(elements.productTitle));
        myClick(elements.productTitle);

        String text=elements.text.getText();

        Assert.assertEquals(text,"Adobe Photoshop CS4");





    }


}
