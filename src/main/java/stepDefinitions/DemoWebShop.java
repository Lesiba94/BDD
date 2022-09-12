package stepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShop {


    public LoginPage loginPage;
    public HomePage homePage;
    public DemoWebShop(WebDriver driver)
    {

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);


    }

}