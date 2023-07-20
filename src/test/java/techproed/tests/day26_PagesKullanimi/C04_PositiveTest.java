package techproed.tests.day26_PagesKullanimi;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C04_PositiveTest {
    @Test
    public void test01() {

         //Acceptance Criteria:
        // Admin olarak, uygulamaya giriş yapabilmeliyim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        // https://www.bluerentalcars.com/
        // Admin email: jack@gmail.com
        // Admin password: 12345



    }
}
