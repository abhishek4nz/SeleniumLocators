package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorsXpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","//home//innofied//Documents//Selenium//Drivers//chromedriver");

       WebDriver driver = new ChromeDriver();  //LAUNCH DESIRED BROWSER

        driver.manage().window().maximize();    //MAXIMIZE BROWSER WINDOW
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    //WAIT FOR ELEMENT TO LOAD
        driver.get("https://saucedemo.com");    //OPEN DESIRED WEBSITE

        //ABSOLUTE XPATH
        //ABSOLUTE XPATH IS LONGER
        //ABSOLUTE XPATH CANNOT BE ACCESSED DIRECTLY. IT WILL TRAVERSE VIA NODES IN DOM
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("standard_user");

        // RELATIVE XPATH
        // RELATIVE XPATH IS SHORTER
        // RELATIVE XPATH CAN BE ACCESSED DIRECTLY. IT WILL DIRECTLY JUMP INTO THE DESIRED ELEMENT
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("secret_sauce");

        //NOW LETS USE DYNAMIC XPATH
        // OR, AND, CONTAINS, STARTS-WITH, TEXT ARE THE VARIOUS DYNAMIC XPATH METHODS AVAILABLE

        //USING OR FUNCTION IN XPATH
        driver.findElement(By.xpath("//*[@id='login-button' or @name='login-button']")).click();

        //CALCULATE NUMBER OF ITEMS PRESENT IN SITE
        System.out.println(driver.findElements(By.xpath("//*[@class='inventory_item']")).size());

      /*  int i=0;

        //USING A LOOP TO ADD ALL THE ITEMS IN CART
        while (i<driver.findElements(By.xpath("//*[@class='inventory_item']")).size())
        {
            i++;
            //ADD ITEM TO CART USING CHAINED XPATH AND TEXT METHOD
            driver.findElement(By.xpath("//*[@class='inventory_item']['"+i+"']//div[2]//div[2]//button[text()='Add to cart']")).click();

        } */

        //TRYING A FOR LOOP INSTEAD OF A WHILE TO MAKE IT SHORTER
        for (byte i=1;i<=driver.findElements(By.xpath("//*[@class='inventory_item']")).size();i++)
            driver.findElement(By.xpath("//*[@class='inventory_item']['"+i+"']//div[2]//div[2]//button[text()='Add to cart']")).click();


        Thread.sleep(3000);
        //ADD AN ITEM TO CART
       // driver.findElement(By.xpath("//*[@class='inventory_item'][1]//div[2]//div[2]//button")).click();

        //USING CONTAINS FUNCTION IN XPATH
        driver.findElement(By.xpath("//a[contains(@class,'cart')]")).click();

        //USING AND FUNCTION IN XPATH
        driver.findElement(By.xpath("//*[@id='checkout' and @name='checkout']")).click();

        Thread.sleep(1000);

        //USING STARTS-WITH IN XPATH
        driver.findElement(By.xpath("//input[starts-with(@id,'first')]")).sendKeys("Ricky");

        //USING CHAINED XPATH
        driver.findElement(By.xpath("//div[@class='form_group']//input[@id='last-name']")).sendKeys("Bono");

        //USING INDEX XPATH
        driver.findElement(By.xpath("//input[@id='postal-code'][1]")).sendKeys("123456");

        //USING CSS SELECTOR
        driver.findElement(By.cssSelector("#continue")).click();

        //USING RELATIVE XPATH
        System.out.println(driver.findElement(By.xpath("//*[contains(@class,'total')][2]")).getText());

        //USING CHAINED XPATH WITH CONATINS AND INDEX
        driver.findElement(By.xpath("//div[contains(@class,'footer')]//button[2]")).click();

        //USING XPATH
        System.out.println(driver.findElement(By.xpath("//span[@class='title']")).getText());

        Thread.sleep(5000);
        driver.close();


    }
}
