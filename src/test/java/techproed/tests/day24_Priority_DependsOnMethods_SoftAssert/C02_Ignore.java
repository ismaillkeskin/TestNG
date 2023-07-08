package techproed.tests.day24_Priority_DependsOnMethods_SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_Ignore {

    /*
    Birden fazla test methodu calistirmak istedigimizde o anlik gereksiz gordugumuz test methodunu
    atlamak (ignore) isteyebiliriz.Bunun icin @Test notasyonu ustune ya da yanina @Ignore notasyonu
    eklememiz yeterlidir @Ignore notasyonu ile atladığımız method konsolda gözükmez raporlamalarda gözükür.
    Eğer bir methodu tamamen iptal etmek isterseniz @Test notasyonundan sonra parametre olarak (enable=false)
    kullanabilirsiniz
     */

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Ignore
    @Test(priority =1)
    public void amazonTest() {
        driver.get("https://amazon.com");

    }

    @Test(enabled = false)
    public void youtubeTest() {
        driver.get("https://youtube.com");

    }
    @Test(priority = 2)
    public void facebookTest() {
        driver.get("https://facebook.com");

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
