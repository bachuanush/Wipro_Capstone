package StepDefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefination.Page;

import java.time.Duration;

import org.junit.Assert;

public class User5_Step {
    WebDriver driver;
    WebDriverWait wait;
    Page pg;

    @Given("redirect to webpage")
    public void redirect_to_webpage() {
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://bstackdemo.com");
        
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        pg = new Page(driver);
    }

    @When("navigate to login page")
    public void navigate_to_login_page() {
    	pg.login_page();
    }

    @And("enter the user5 signin credentials")
    public void enter_the_user5_signin_credentials() throws InterruptedException {
    	pg.user5();
    }

    @And("user not able to login to website")
    public void user_not_able_to_login_to_website() {
    	WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(pg.lockedstatus));
        String errMsg = msg.getText();
        Assert.assertEquals(errMsg, "Your account has been locked.");
        System.out.println("User5 account has been locked");

    }

    @Then("validated the user5 login")
    public void validated_the_user5_login() {
    	System.out.println("validated the user5 login");
    	driver.quit();
    }
    
}


