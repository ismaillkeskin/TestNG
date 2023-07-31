package techproed.tests.day30_Listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_ListenersTest2 {
    @Test
    public void test01() {
        System.out.printf("Passed");
        Assert.assertTrue(true);
        Assert.assertEquals(2,2);
    }

    @Test
    public void test02() {
        System.out.println("FAIL");
        Assert.assertTrue(false);//False olduğundan ekram resmi almak için browser'i açtı
    }
    @Test
    public void test03() {
        System.out.println("SKIP");
        throw new SkipException("Bu method atlandı");
    }
    @Test
    public void test04() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().findElement(By.id("lkjlsdf")).click();
    }
}
