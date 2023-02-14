package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","//home//innofied//Documents//Selenium//Drivers//chromedriver");
        WebDriver driver = new ChromeDriver();  //OPEN CHROME BROWSER
        driver.manage().window().maximize();    //MAXIMIZE BROWSER WINDOW

        driver.get("https://saucedemo.com");     //OPEN DESIRED WEBPAGE

       if(driver.findElement(By.className("login_logo")).isDisplayed())  //RETURNS TRUE IF IMAGE IS DSIPLAYED
           System.out.println("Image is present");      //PRINTS STATEMENT IF CONDITION IS TRUE

        System.out.println(driver.findElement(By.id("user-name")).getAttribute("placeholder")); //PRINT THE ATTRIBUTE TEXT
        driver.findElement(By.id("user-name")).sendKeys("standard_user");    //IDENTIFY THE ELEMENT AND PASS VALUES FROM KEYBOARD
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        System.out.println(driver.findElement(By.cssSelector("[id='login_credentials'] h4")).getText());
     /*   driver.findElement(By.id("login-button")).submit();      //SUBMIT ON THE DESIRED BUTTON USING ID

        System.out.println(driver.findElement(By.className("footer_copy")).getText());     //PRINT FOOTER TEXT

        System.out.println("No of images present: "+driver.findElements(By.className("inventory_item")).size());    //COLLECT ALL THE WEBELEMENTS IN AN ARRAY LIST

        System.out.println("No of links in the page: "+driver.findElements(By.tagName("a")).size());
        driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        Thread.sleep(2000);     //CLICK USING LINK TEXT
        driver.navigate().back();       //NAVIGATE TO PREVIOUS PAGE
        driver.findElement(By.partialLinkText("Light")).click();        //CLICK USING PARTIAL LINK TEXT
        Thread.sleep(2000);     //CLICK USING LINK TEXT
        driver.navigate().back();       //NAVIGATE TO PREVIOUS PAGE

        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();     //CLICK USING CSS SELECTOR
        driver.findElement(By.cssSelector("[data-test=add-to-cart-sauce-labs-bike-light]")).click();
        driver.findElement(By.cssSelector("[name=add-to-cart-sauce-labs-bolt-t-shirt]")).click();   */

        Thread.sleep(1000);
        driver.close();     //CLOSE THE BROWSER


    }
}
