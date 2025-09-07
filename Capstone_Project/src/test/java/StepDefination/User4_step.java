package StepDefination;



import io.cucumber.java.en.*;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class User4_step {
    WebDriver driver;
    Page pg6;
    
    @Given("go to website")
    public void go_to_website() {
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://bstackdemo.com");

        pg6 = new Page(driver);
    }

    @When("redirect to login")
    public void redirect_to_sigin_login() {
    	pg6.login_page();
    }
    
    @And("signin with the user3")
    public void signin_with_the_user3() throws InterruptedException {
    	pg6.user4();
    }

    @And("user should had logged in with user3 credentials")
    public void user_should_had_logged_in_with_user3_credentials() throws InterruptedException {
    	System.out.println("signed in to the website");
    }

    @And("go to the favourites page")
    public void go_to_the_favourites_page() throws InterruptedException {
    	pg6.openFavourites();
        Thread.sleep(2000);
    }
    
    @And("view the products")
    public void view_the_products() throws InterruptedException {
		Thread.sleep(5000);
    }

    @And("remove products from favourites")
    public void remove_products_from_favourites() {
    	pg6.removeProductFromFavourites();
    }

    @And("click on logout option")
    public void click_on_logout_option() {
    	pg6.Logout();
    }

    @And("logged out from the bstackdemo")
    public void logged_out_from_the_bstackdemo() {
    	System.out.println("Successfully logged out from the page");
    }

    @Then("validated the user4 functionalities")
    public void validated_the_user4_functionalities() {
    	System.out.println("Validate the user4");
    	driver.quit();
    }
    
}
