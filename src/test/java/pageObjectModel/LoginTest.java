package pageObjectModel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    static WebDriver driver;
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");


        OldPom loginpg = new OldPom(driver);

        loginpg.setUsername("standard_user");

        loginpg.setPassword("secret_sauce");

        loginpg.submitButton();

        driver.close();

    }
}
