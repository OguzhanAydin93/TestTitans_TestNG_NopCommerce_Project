package NopCommerce_Project;

import Utility.BaseDriver;
import com.beust.ah.A;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class NopCommerce extends BaseDriver {

    @Test(groups = {"Registiration", "Smoke"})
    public void US_501_Nuri() {
        BaseDriver.driver.navigate().to("https://demo.nopcommerce.com/");

        Nuri_POM elements = new Nuri_POM();

        myClick(elements.register);
        myClick(elements.gender);
        mySendKeys(elements.firstname, "TeamTitans");
        mySendKeys(elements.lastname, "Techno123");
        Select day = new Select(elements.day);
        day.selectByIndex(5);
        Select month = new Select(elements.month);
        month.selectByValue("5");
        Select year = new Select(elements.year);
        year.selectByIndex(1);
        mySendKeys(elements.email, "techno+1@gmail.com");
        mySendKeys(elements.companyname, "TestTitans");
        mySendKeys(elements.password, "123456");
        mySendKeys(elements.confirmpassword, "123456");

        myClick(elements.registerButton);
    }

    @Test(groups = {"Login Test", "Smoke"})
    public void US_502_Hatun() {
        BaseDriver.driver.navigate().to("https://demo.nopcommerce.com/");
        Hatun_POM elements = new Hatun_POM();

        wait.until(ExpectedConditions.elementToBeClickable(elements.loginBtn));
        elements.loginBtn.click();
        mySendKeys(elements.email, "techno+1@gmail.com");
        mySendKeys(elements.password, "123456");
        myClick(elements.loginButton);
        myClick(elements.logOut);

    }

    @Test(groups = "Login Test")
    public void US_503_Nuri_Hatun(String email, String Password) {
        driver.get("https://demo.nopcommerce.com/");
        Hatun_POM elements = new Hatun_POM();

        myClick(elements.loginBtn);
        mySendKeys(elements.email, "techno+1@gmail.com");
        mySendKeys(elements.password, "123456");
        myClick(elements.loginButton);

        if (
                ((email.equals("admin")) ||
                        (email.equals("admin1")) ||
                        (email.equals("admin3")) ||
                        (email.equals("admin5")) ||
                        (email.equals("admin7")) ||
                        (email.equals("admin9")))
                        &&
                        Password.equals("admin1")) {
            Assert.assertTrue(elements.alertDanger.getText().toLowerCase().contains("ınvalid"));
        } else if (email.equals("techno+1@gmail.com") && Password.equals("123456")) {
            Assert.assertTrue(elements.loginAccount.getText().contains("Logged"));

        }
    }

    @DataProvider
    Object[][] basarisizGiris() {
        Object[][] emailVeSifre =
                {
                        {"admin", "admin1"},
                        {"admin1", "admin1"},
                        {"admin3", "admin1"},
                        {"admin5", "admin1"},
                        {"admin7", "admin1"},
                        {"admin9", "admin1"},
                        {"techno+1@gmail.com", "Admin123"}
                };
        return emailVeSifre;
    }


    @Test(groups = {"UITesting", "TAB Menu Testing"})
    public void US_504_Oguzhan() {

        Oguzhan_POM elements = new Oguzhan_POM();

        Actions actions = new Actions(driver);


        myClick(elements.computers);
        myAssert(elements.pageText, "Computers");
        myClick(elements.logo);
        actions.moveToElement(elements.computers).build().perform();
        actions.moveToElement(elements.desktops).click().perform();
        myAssert(elements.pageText, "Desktops");
        myClick(elements.logo);
        actions.moveToElement(elements.computers).build().perform();
        actions.moveToElement(elements.notebooks).click().perform();
        myAssert(elements.pageText, "Notebooks");
        myClick(elements.logo);
        actions.moveToElement(elements.computers).build().perform();
        actions.moveToElement(elements.software).click().perform();
        myAssert(elements.pageText, "Software");
        myClick(elements.logo);
        myClick(elements.electronics);
        myAssert(elements.pageText, "Electronics");
        myClick(elements.logo);
        actions.moveToElement(elements.electronics).build().perform();
        actions.moveToElement(elements.cameraAndPhoto).click().perform();
        myAssert(elements.pageText, "Camera & photo");
        myClick(elements.logo);
        actions.moveToElement(elements.electronics).build().perform();
        actions.moveToElement(elements.cellPhone).click().perform();
        myAssert(elements.pageText, "Cell phones");
        myClick(elements.logo);
        actions.moveToElement(elements.electronics).build().perform();
        actions.moveToElement(elements.others).click().perform();
        myAssert(elements.pageText, "Others");
        myClick(elements.logo);
        myClick(elements.apparel);
        myAssert(elements.pageText, "Apparel");
        myClick(elements.logo);
        actions.moveToElement(elements.apparel).build().perform();
        actions.moveToElement(elements.shoes).click().perform();
        myAssert(elements.pageText, "Shoes");
        myClick(elements.logo);
        actions.moveToElement(elements.apparel).build().perform();
        actions.moveToElement(elements.clothing).click().perform();
        myAssert(elements.pageText, "Clothing");
        myClick(elements.logo);
        actions.moveToElement(elements.apparel).build().perform();
        actions.moveToElement(elements.accessories).click().perform();
        myAssert(elements.pageText, "Accessories");
        myClick(elements.logo);
        myClick(elements.digitalDownload);
        myAssert(elements.digitalDownload, "Digital downloads");
        myClick(elements.logo);
        myClick(elements.books);
        myAssert(elements.books, "Books");
        myClick(elements.logo);
        myClick(elements.jewelry);
        myAssert(elements.jewelry, "Jewelry");
        myClick(elements.logo);
        myClick(elements.giftCards);
        myAssert(elements.giftCards, "Gift Cards");

    }

    @Test(groups = {"UITesting", "TAB Menu Testing", "Search Testing", "Regression"})
    @Parameters("searchText")
    public void US_505_Oguzhan(String searchID) {
        Oguzhan_POM elements = new Oguzhan_POM();

        driver.get("https://demo.nopcommerce.com/");
        Actions actions = new Actions(driver);


        actions.moveToElement(elements.computerTab).build().perform();
        elements.noteBooks.click();

        for (WebElement e : elements.noteBooksAll) {

            if (searchID.equals(e.getText())) {
                System.out.println("TEST PASSED" + "\n" + e.getText());
            }
        }
        elements.searcButton.click();
        elements.searcButton.sendKeys(searchID + Keys.ENTER);

        elements.pageText2.getText();

        Assert.assertTrue(elements.pageText2.getText().contains(searchID));

    }

    @Test(groups = {"UITesting", "TAB Menu Testing", "Order Testing"})
    public void US_506_Asli() {

        Asli_POM elements = new Asli_POM();

        elements.loginFunctionality();

        wait.until(ExpectedConditions.visibilityOf(elements.giftcards));
        myClick(elements.giftcards);

        myClick(elements.urun1);
        wait.until(ExpectedConditions.visibilityOf(elements.recName));
        mySendKeys(elements.recName, "zeynep");
        mySendKeys(elements.recEmail, "zeynep0@gmail.com");
        mySendKeys(elements.sender, "Aslı");
        mySendKeys(elements.senderEmail, "aslicelikz@outlook.com");
        myClick(elements.add);

        Assert.assertTrue(elements.msg.isDisplayed(), "The product has been added to your ");
    }





    @Test(groups = {"UITesting", "TAB Menu Testing", "Order Testing"})
    public void US_507_Zehra() {
        Zehra_POM elements = new Zehra_POM();
        Actions actionDriver = new Actions(driver);

        for (WebElement tabMenu : elements.tabMenu) {
            System.out.println(tabMenu.getText());
            Assert.assertTrue(tabMenu.isDisplayed(), "Tab Menu görüntülenemedi.");
        }

        actionDriver.moveToElement(elements.computers).
                moveToElement(elements.dekstops).click().build().perform();
        wait.until(ExpectedConditions.urlContains("desktops"));

        myJSClick(elements.buildComp);
        elements.ramSelect();
        elements.hddSelect();
        myClick(elements.addToCard);
        Assert.assertTrue(elements.addedMsg.isDisplayed(), "Ürün eklenemedi.");


    }

    @Test(groups = {"Smoke", "Regression", "UITesting", "Search Testing"})
    @Parameters("message")
    public void US_508_Mert(String inputMsg) {
        Mert_POM elements = new Mert_POM();


        wait.until(ExpectedConditions.visibilityOf(elements.searchBox));
        mySendKeys(elements.searchBox, inputMsg);
        BaseDriver.wait.until(ExpectedConditions.elementToBeClickable(elements.searchButton));
        myJSClick(elements.searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(elements.productTitle));
        myClick(elements.productTitle);

        String text = elements.text.getText();

        Assert.assertEquals(text, "Adobe Photoshop CS4");

    }
}
