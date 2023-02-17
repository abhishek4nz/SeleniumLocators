package junitdemo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junittest1  {

   static {System.setProperty("webdriver.chrome.driver","//home//innofied//Documents//Selenium//Drivers//chromedriver");
   }
       WebDriver driver=new ChromeDriver();

    @Test
    public void firsttest() {

        driver.manage().window().maximize();
        System.out.println("Lets create first junit test");
    }

    @Test
    public void secondtest()    {

        driver.get("https://saucedemo.com");
        driver.close();
    }
}
