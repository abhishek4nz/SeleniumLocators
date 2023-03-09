package pageObjectModel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngPOM extends BaseClass{

    @BeforeMethod
    void setup()    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(URL);
    }

    @AfterMethod
    void tearDown() {
        driver.close();
    }

    @Test(priority = 0)
    void oldpom()   {
        OldPom op=new OldPom(driver);
        op.setUsername(username);
        op.setPassword(password);
        op.submitButton();
    }

    @Test(priority = 1)
    void newpom() {
        NewPom np=new NewPom(driver);
        np.setUsername(username);
        np.setPassword(password);
        np.submitButton();
    }
}
