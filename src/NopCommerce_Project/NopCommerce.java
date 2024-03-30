package NopCommerce_Project;

import Utility.BaseDriver;
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

        Mert_POM.Login(String );




    }


}
