package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPom {

    WebDriver driver;

    //CREATING A CONSTRUCTOR TO PASS WEBDRIVER
    public NewPom(WebDriver driver) {
        this.driver = driver;         //ASSIGNING THE CONSTRUCTOR DRIVER INTO OUR LOCAL DRIVER

        //INITIALIZING PAGE FACTORY USING LOCAL DRIVER
        PageFactory.initElements(driver, this);
    }

    //LOCATE AND CREATE WEB ELEMENTS
        @FindBy(name = "user-name")  @CacheLookup
        WebElement username;

        @FindBy(name = "password")  @CacheLookup
        WebElement password;

        @FindBy(id = "login-button")    @CacheLookup
        WebElement button;

        //CREATE ACTIONS USING METHODS OF EACH ELEMENT
    void setUsername(String username) {
        this.username.sendKeys(username);
    }

    void setPassword(String password)  {
        this.password.sendKeys(password);
    }

    void submitButton()   {
        button.submit();
    }





}
