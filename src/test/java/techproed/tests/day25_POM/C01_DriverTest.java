package techproed.tests.day25_POM;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class C01_DriverTest {

    @Test
    public void test01() {
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("http://youtube.com");
        Driver.getDriver().get("http://facebook.com");
        Driver.quitDriver();
      /*
        Bu method'da driver'i if blogu icine almadigimizdan dolayi her sayfa icin yeni bir driver actiginin ornegini
    gosterdik
       */
    }

    @Test
    public void test02() {
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("http://youtube.com");
        Driver.closeDriver();
        Driver.getDriver().get("http://facebook.com");
        Driver.closeDriver();
    }

    @Test
    public void test03() {
        Driver driver = new Driver();
        driver.getDriver().get("http://amazon.com");
    }
}
