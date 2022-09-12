package Pages;

import models.User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Scanner;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);


    }

    @FindBy(name = "username")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement passWord;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginBtn;

    public void LoginPage(User user)
    {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        userName.sendKeys(user.username);
        passWord.sendKeys(user.password);
        loginBtn.click();





    }

}
