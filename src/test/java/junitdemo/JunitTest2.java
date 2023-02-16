package junitdemo;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

    @TestInstance(value = TestInstance.Lifecycle.PER_CLASS)        //FOR CREATING A SINGLE INSTANCE FOR ALL TESTS
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    @DisplayName("JUNIT TEST SUITE")

    public class JunitTest2 extends BaseClass {

    @BeforeAll
     void setup() {
        System.setProperty("webdriver.chrome.driver","//home//innofied//Documents//Selenium//Drivers//chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterEach
     void addPause() throws InterruptedException { Thread.sleep(2000); }

    @RepeatedTest(1)                     //REPEATS THE TEST ONCE MORE
    @DisplayName("OPEN THE DESIRED URL")            //NAME OF TEST
    @Order(1)
     void first()    {
        driver.get("https://saucedemo.com");
    }

    @Test
    @DisplayName("LOGIN TO THE APPLICATION")
    @Disabled("LETS GET IT DISABLED")
    @Order(2)
     void second() {
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id='login-button' or @name='login-button']")).click();
    }

    @Test
    @Tag("group")       //USAGE OF GROUP
    void third()   {
//        System.out.println("Will this run only?");
        driver.get("https://google.com");
    }

    @AfterAll
     void teardown()  {
        driver.close();
    }
}

