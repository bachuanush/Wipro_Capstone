package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiProdutsToCart {
	WebDriver driver;
	Page pg3;
	
	@Given("open the website")
	public void open_the_website() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://bstackdemo.com");
        
        pg3 = new Page(driver);
	}

	@When("redirect to the authenticate page")
	public void redirect_to_the_authenticate_page() {
		pg3.login_page();
	}

	@And("enter the user details")
	public void enter_the_user_details() throws InterruptedException {
		pg3.Login_1();
	}

	@And("user had successfully entered to the page")
	public void user_had_successfully_entered_to_the_page() {
		System.out.println("user successfully entered the page");
	}

	@And("search the different products")
	public void search_the_different_products() {
		pg3.srch_items();
	}

	@And("sort the products from the increasing order")
	public void sort_the_products_from_the_increasing_order() throws InterruptedException{
		pg3.selectlowtohigh();
	}

	@And("add items to the cart from each brands")
	public void add_items_to_the_cart_from_each_brands() throws InterruptedException{
		pg3.ShopByVendors();
	}

	@And("different items should added successfully to cart")
	public void different_items_should_added_successfully_to_cart() {
		System.out.println("added products to the cart from different brands");
	}

	@And("Increase the product quantity in the cart")
	public void increase_the_product_quantity_in_the_cart() throws InterruptedException{
		pg3.increase_product_qty_in_cart();
	}

	@Then("Added different items from the different brands to the cart successfully")
	public void added_different_items_from_the_different_brands_to_the_cart_successfully() {
		System.out.println("Increased the count of items in the cart, items were added to cart from different vendors");
		driver.quit();
	}

}
