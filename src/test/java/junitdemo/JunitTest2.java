package junitdemo;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)         //FOR CREATING A SINGLE INSTANCE FOR ALL TESTS
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JunitTest2 {

     WebDriver driver;

    @BeforeAll
     void first() {
        System.setProperty("webdriver.chrome.driver","//home//innofied//Documents//Selenium//Drivers//chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
     void addPause() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test()
    @Order(1)
    @DisplayName("OPEN THE DESIRED URL")
     void second()    {
        driver.get("https://saucedemo.com");
    }

    @Test
    @Order(2)
    @DisplayName("LOGIN TO THE APPLICATION")
     void third() {
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id='login-button' or @name='login-button']")).click();
    }
    @AfterAll
     void teardown()  {
        driver.close();
    }
}
