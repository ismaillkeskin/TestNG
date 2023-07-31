package techproed.tests.day26_PagesKullanimi;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C01_PageKullanimi {
    @Test
    public void test01() throws InterruptedException {
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
       // Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Driver.getDriver().get(ConfigReader.getProperty("opensourceUrl"));
       Thread.sleep(2000);

        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim
        //Admin -->properties dosyasında
        //admin123 -->properties dosyasında
        /*
        Locateleri olusturdugumuz page class'indaki webelementlere ulasabilmek icin
        asagidaki ornekteki gibi classdaki const. dan obje olusturduk
         */

        OpenSourcePage sourcePage = new OpenSourcePage();
        sourcePage.username.sendKeys(ConfigReader.getProperty("username"));
        sourcePage.password.sendKeys(ConfigReader.getProperty("sifre"));
        ReusableMethods.bekle(3); //-->Thread.sleap(), methodunu kullandık
        sourcePage.loginButton.click();


        //Login Testinin basarili oldugunu test et
        Assert.assertTrue(sourcePage.verify.isDisplayed());


    }
}
