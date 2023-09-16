package techproed.tests.day27_SmokeTest_Excel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

public class C03_BlueRentalExcelTest {
    @Test
    public void test01() {
        /*
        Test yaptığımız sayfadaki dataları .properties yada excel dosyasından alabiliriz
        .properties dosyasından verileri okuyabilmemiz için ConfigReadr class'ı oluşturturduk,
        Aynı şekilde excel dosyasındaki verileri okuyabilmek için ExcelReader Class'ı oluşturduk. Buradan
        alacağımız email ve password bilgilerini String bir değişkene assing edip login testi yapacağımız
        sitede sendKeys() methodu ile çok rahat kullanabiliriz
         */
        ExcelReader reader = new ExcelReader("src/test/java/techproed/resources/mysmoketestdata.xlsx","customer_info");

        String email = reader.getCellData(1,0);
        String password = reader.getCellData(1,1);
        System.out.println();

        //BlueRentalCar sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        //mysmoketestdata excel dosyasından bir kullanıcı ile login olalım
        BlueRentalPage rentalPage = new BlueRentalPage();
        rentalPage.login.click();
        ReusableMethods.bekle(2);
        rentalPage.email.sendKeys(email, Keys.TAB, password, Keys.ENTER );
        ReusableMethods.bekle(2);

        //Login oldugumuzu dogrulayalim
        Assert.assertTrue(rentalPage.loginVerify.getText().contains("Sam"));
        /*
     Login webelementi login olduktan sonrada ayni locate sahip olabilme ihtimaline karsi daha garantili bir
     dogrulama yapmak icin login olduktan sonra login webelementinin oldugu yerde login oldugumuz yerde kullanici
     ismi cikacaktir. Bu webelementin getText() methodu ile alip kullanici ismini iceriyor mu ? icermiyor mu olarak
     test ederiz.
      */

       //Sayfayi kapatalim
      Driver.closeDriver();

    }
}
