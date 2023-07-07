package techproed.tests.day23_Annotation;

import org.testng.annotations.*;

public class C01_Annotation {
   @BeforeSuite
   public void suite(){
       System.out.println("Her şeyden önce Before Suite Çalışır");
   }
   @BeforeTest
    public void beforeTest(){
       System.out.println("Testlerden önce bir kez çalışır");
   }
   @BeforeClass
    public void beforeClass(){
       System.out.println("Her Class'dan önce bir kez çalışır");
   }
  @BeforeMethod
  public void setUp(){
      System.out.println("Junitteki @Before notasyonu gibi her methottan once calisir");
  }

    @Test
    public void test01() {

    }

    @Test
    public void test02() {

    }

    @Test
    public void test03() {

    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Herşeyden sonra 1 kez çalışır");

    }
    @AfterTest
    public void afterTest() {
        System.out.println("Her testten sonra 1 kez çalışır");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Her class'dan sonra 1 kez çalışır");
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("Junit'teki @After notasyonu gibi her method'dan sonra çalışır");
    }

}
