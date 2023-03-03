package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OldPom {

    WebDriver driver;           //INITIALIZE WEBDRIVER

    //CREATING A CONSTRUCTOR FOR CREATING THE WEBDRIVER INSTANCE
    public OldPom(WebDriver driver)    {
        this.driver=driver;
    }
    By username = By.id("user-name");
    By password = By.id("password");

    By name = By.name("login-button");

    //CREATING ACTION METHODS FOR EACH FIND AND PERFORM ACTION ON THE WEBELEMENTS
    void setUsername(String standardUser)  {
        driver.findElement(username).sendKeys(standardUser);
    }

    void setPassword(String pass)  {
        driver.findElement(password).sendKeys(pass);
    }

    void submitButton() {
        driver.findElement(name).submit();
    }
}
