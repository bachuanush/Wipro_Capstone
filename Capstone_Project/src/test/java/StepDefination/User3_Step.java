package StepDefination;


import io.cucumber.java.en.*;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import StepDefination.Page;


public class User3_Step {
    WebDriver driver;
    Page pg;
    
    @Given("go to website and it should be opened in Browser")
    public void go_to_website_and_it_should_be_opened_in_browser() {
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://bstackdemo.com");
       
        pg = new Page(driver);
    }

    @When("navigate to sigin")
    public void navigate_to_sigin() {
    	pg.login_page();
    }

    @And("login with the user3")
    public void login_with_the_user3() throws InterruptedException {
    	pg.user3();
    }

    @And("user should had logged in")
    public void user_should_had_logged_in() {
    	System.out.println("User logged-in successfully");
    }

    @And("go to the orders page")
    public void go_to_the_orders_page() throws InterruptedException {
    	pg.orders_page();
    }

    @And("check the previous orders products")
    public void check_the_previous_orders_products() throws InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,600);");
		Thread.sleep(5000);
    }

    @And("click on signout")
    public void click_on_signout() {
    	pg.Logout();
    }

    @And("signed out successfully")
    public void signed_out_successfully() {
    	System.out.println("Successfully logged out");
    }

    @Then("validated the user3 functionalities")
    public void validated_the_user3_functionalities() {
    	System.out.println("Validated the user3");
    	driver.quit();
    }
}



