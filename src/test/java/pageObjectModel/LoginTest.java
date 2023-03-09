package pageObjectModel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends BaseClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");


        OldPom loginpg = new OldPom(driver);

        loginpg.setUsername(username);

        loginpg.setPassword(password);

        loginpg.submitButton();

        Thread.sleep(3000);

//        driver.close();
        driver.navigate().back();

        //USING NEW POM OBJECT

        NewPom np = new NewPom(driver);

        np.setUsername("standard_user");
        np.setPassword("secret_sauce");
        np.submitButton();

        driver.close();

    }
}
