package techproed.tests.day26_PagesKullanimi;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.pages.OpenSourcePageClass;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C02_PageKullanimi {
    @Test
    public void test01() {
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        Driver.getDriver().get(ConfigReader.getProperty("opensourceUrl"));

        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim
        //Admin -->properties dosyasında
        //admin123 -->properties dosyasında
        OpenSourcePageClass.username().sendKeys(ConfigReader.getProperty("username"));
        OpenSourcePageClass.password().sendKeys(ConfigReader.getProperty("sifre"));
        ReusableMethods.bekle(2);
        OpenSourcePageClass.loginButton().click();

        //Login Testinin basarili oldugunu test et
        Assert.assertTrue(OpenSourcePageClass.verify().isDisplayed());

    }
}
