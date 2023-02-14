package inno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Zoho {
    public static void main(String[] args) throws InterruptedException {

        //SET PATH FOR CHROME DRIVER
        System.setProperty("webdriver.chrome.driver","//home//innofied//Documents//Selenium//Drivers//chromedriver");

        //LAUNCH CHROME BROWSER
        WebDriver driver = new ChromeDriver();

        //USING IMPLICIT WAIT
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        //OPEN BASE URL
        driver.get("https://www.zoho.com/people/login.html");

        driver.manage().window().maximize();

        //CLICK ON SIGN IN
        driver.findElement(By.className("zlogin-apps")).click();

        //ENTER USERNAME
        driver.findElement(By.name("LOGIN_ID")).sendKeys("abhishek.debnath@innofied.com");

        //CLICK ON NEXT
        driver.findElement(By.id("nextbtn")).click();

        //WAIT FOR 2 SECONDS
        Thread.sleep(2000);

        //ENTER PASSWORD
        driver.findElement(By.name("PASSWORD")).sendKeys("abhishek4innofied");

        //WAIT FOR 1 SECOND
      //  Thread.sleep(1000);

        //SUBMIT
        driver.findElement(By.id("nextbtn")).submit();

        //CLICK ON TIME TRACKER
        driver.findElement(By.id("zp_maintab_timetracker")).click();

        //CLICK ON LEAVE TRACKER
        driver.findElement(By.id("zp_maintab_leavetracker")).click();

        Thread.sleep(1000);

        //CLICK ON LEAVE APPLICATIONS
       // driver.findElement(By.xpath("a[text()='Leave Applications']")).click();


    }
}
