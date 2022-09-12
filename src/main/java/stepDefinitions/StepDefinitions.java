package stepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    public WebDriver driver;
    public DemoWebShop application;

    @Given("Lunch chrome")
    public void lunch_chrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        application = new DemoWebShop(driver);


    }
    @Given("Demo web shop page is open")
    public void demo_web_shop_page_is_open() {

        application.loginPage.LoginPage(new User("Admin","admin123"));
    }
    @When("user enter valid username and password")
    public void user_enter_valid_username_and_password() {
        application.homePage.home();
    }
    @Then("user login successfully")
    public void user_login_successfully() {

    }
}
