package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }





    public void home()
    {


        String exp = "OrangeHRM";
        String act = driver.getTitle();

        if(exp.equalsIgnoreCase(act))
        {
            System.out.println("Successfully open");
        }
        else
        {
            System.out.println("Homepage didn't open");
        }

        driver.close();
        driver.quit();
    }

}
