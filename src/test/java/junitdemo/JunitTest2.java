package junitdemo;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public class JunitTest2 {

     WebDriver driver;

    @BeforeAll
    public void first() {
        System.setProperty("webdriver.chrome.driver","//home//innofied//Documents//Selenium//Drivers//chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void addPause() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test()
    @DisplayName("OPEN THE DESIRED URL")
    public void second()    {
        driver.get("https://saucedemo.com");
    }

    @Test
    @DisplayName("LOGIN TO THE APPLICATION")
    public void third() {
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id='login-button' or @name='login-button']")).click();
    }
    @AfterAll
    public void teardown()  {
        driver.close();
    }
}
