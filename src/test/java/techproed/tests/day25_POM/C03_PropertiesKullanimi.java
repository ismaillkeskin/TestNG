package techproed.tests.day25_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C03_PropertiesKullanimi {

    @Test
    public void test01() {
        //amazon sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

       //basligin Amazon içerdiğini test edelim
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = ConfigReader.getProperty("expectedTitle");
        Assert.assertTrue(actualTitle.contains(expectedTitle));

         //arama kutusunda iphone aratalım
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys(ConfigReader.getProperty("searchText"), Keys.ENTER);

        //sayfayı kapatın
        Driver.closeDriver();

    }

    @Test
    public void test02() {
        String amazonUrl = ConfigReader.getProperty("amazonUrl");
        String amazonExpectedTitle = ConfigReader.getProperty("expectedTitle");
        String searchBox = ConfigReader.getProperty("searchBox");
        System.out.println(amazonUrl);
        System.out.println(amazonExpectedTitle);
        System.out.println(searchBox);
    }
}
