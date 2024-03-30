package NopCommerce_Project;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NopCommerce extends BaseDriver {

    @Test
    public void US_504_Nuri(){

    }

    @Test
    public void US_504_Oguzhan(){

        Oguzhan_POM oguzhanPom=new Oguzhan_POM();


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
