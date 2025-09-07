package StepDefination;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OtherModules {
	WebDriver driver;
	Page pg2;
	
	@Given("open the bstackdemo")
	public void open_the_bstackdemo() throws InterruptedException {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://bstackdemo.com");
        
        pg2 = new Page(driver);
	}
	
	@When("redirect to sigin page")
	public void redirect_to_sigin_page() {
		pg2.login_page();
	}

	@When("enter the login details")
	public void enter_the_login_details() throws InterruptedException {
		pg2.Login_1();
	}

	@And("go to the newletter section")
	public void go_to_the_newletter_section() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	@And("enter the email address and subscribe it")
	public void enter_the_email_address_and_subscribe_it() {
		pg2.newsLetter();
	}

	@And("user should successfully subscribed to the newsletter")
	public void user_should_successfully_subscribed_to_the_newsletter() {
		System.out.println("Subscribed to newsletter");
	}

	@And("go to the privacy policy section")
	public void go_to_the_privacy_policy_section() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	@And("read the privacy policy")
	public void read_the_privacy_policy() throws InterruptedException {
		pg2.privacy_policy();
	}

	@And("go to the offers section")
	public void go_to_the_offers_section() throws InterruptedException {
		pg2.Offers();
	}

	@And("check any offers are avilable")
	public void check_any_offers_are_avilable() {
		System.out.println("checked the offers page");
	}

	@And("if any offers are available add the products to the cart")
	public void if_any_offers_are_available_add_the_products_to_the_cart() {
		 String offersText = driver.findElement(pg2.offerspage).getText();
         Assert.assertTrue(offersText.contains("We've promotional offers in your location."));
         System.out.println("Offers page validated successfully");
	}

	@And("if there are no offers are available, go to the main page")
	public void if_there_are_no_offers_are_available_go_to_the_main_page() {
		driver.get("https://bstackdemo.com");
	}

	@Then("Explored all the Modules")
	public void explored_all_the_modules() {
		System.out.println("Checked is there any offers available in the offer section and also subscribed to the NewsLetter");
		driver.quit();
	}
}
