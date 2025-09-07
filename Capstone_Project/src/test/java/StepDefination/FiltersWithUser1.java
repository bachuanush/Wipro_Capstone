package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FiltersWithUser1 {
	WebDriver driver;
	Page pg;
	
	@Given("open the browser")
	public void open_the_browser() throws InterruptedException {
		driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://bstackdemo.com");
        
        pg = new Page(driver);
	}

	@When("go to the login page")
	public void go_to_the_login_page() throws InterruptedException {
		pg.login_page();
	}

	@And("login to the website with user1 credentials")
	public void login_to_the_website_with_user1_credentials() throws InterruptedException {
		pg.Login_1();
	}
	
	@And("search the product")
	public void search_the_product() {
		pg.srch_items();
	}

	@And("High to Low filters")
	public void high_to_low_filters() throws InterruptedException {
		pg.selecthightolow();		
	}

	@And("Low to High filters")
	public void low_to_high_filters() throws InterruptedException {
		pg.selecthightolow();
	}

	@And("select the brands from the vendors filter")
	public void select_the_brands_from_the_vendors_filter() throws InterruptedException {
		pg.ShopByVendor();
	}

	@And("select a product from the particular brand")
	public void select_a_product_from_the_particular_brand() throws InterruptedException {
		//driver.findElement(By.xpath("//*[@id=\"23\"]/div[1]/button")).click();
		pg.ShopByVendor();
	}

	@And("apply the low to high filter")
	public void apply_the_low_to_high_filter() throws InterruptedException {
		pg.selectlowtohigh();
	}

	@And("apply the high to low filter")
	public void apply_the_high_to_low_filter() throws InterruptedException {
		pg.selecthightolow();
	}

	@And("logout from the page")
	public void logout_from_the_page() {
		pg.Logout();
	}

	@Then("the user is successfully selected product and applied filter")
	public void the_user_is_successfully_selected_product_and_applied_filter() {
		System.out.println("Searched products and slected product from the brands and applied the filters");
		driver.quit();
	}

}
