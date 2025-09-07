package StepDefination;



import io.cucumber.java.en.*;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class User2_Step {
    WebDriver driver;
    Page pg;
    
    @Given("open the Browser")
    public void open_the_browser() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://bstackdemo.com");
       
        pg = new Page(driver);	
    }

    @When("redirect to sigin")
    public void redirect_to_sigin() {
    	pg.login_page();
    }

    @And("login with the user2")
    public void login_with_the_user2() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	pg.user2();
    }

    @And("user had looged in")
    public void user_had_looged_in() {
    	System.out.println("User logged in successfully");
    }

    @And("check the products")
    public void check_the_products() {
    	pg.srch_items();
    }

    @And("image should not be displayed for the products")
    public void image_should_not_be_displayed_for_the_products() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	JavascriptExecutor js4 = (JavascriptExecutor) driver;
    	js4.executeScript("window.scrollBy(0,400);");
    }

    @And("then click on logout")
    public void then_click_on_logout() {
    	pg.Logout();
    }

    @And("logout successfully")
    public void logout_successfully() {
    	System.out.println("User has successfully logged out");
    }

    @Then("validated the user2 functionalities")
    public void validated_the_user2_functionalities() {
    	System.out.println("Validated the user2 functionalities");
    	driver.quit();
    }

}


