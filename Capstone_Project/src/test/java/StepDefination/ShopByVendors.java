package StepDefination;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopByVendors {
	WebDriver driver;
    Page pg1;
    
	@Given("Website should be opened")
	public void website_should_be_opened() throws InterruptedException {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://bstackdemo.com");

        pg1 = new Page(driver);

	}
	
	@When("go to sigin page")
	public void go_to_sigin_page() throws IOException, InterruptedException {
		pg1.login_page();
	}
	
	@And("login with the details")
	public void user_logs_into_the_site() throws IOException, InterruptedException  {
		pg1.Login_1();
	}

	@And("Select a vendor from vendors list")
	public void select_a_vendor_from_vendors_list() throws IOException, InterruptedException {
		Thread.sleep(2000);
		pg1.ShopByVendor();
    	Thread.sleep(2000);

	}
	
	@And("select the product and Add the product to the Wishlist")
	public void select_the_product_and_add_the_product_to_the_wishlist() {
    	driver.findElement(By.xpath("//*[@id=\"23\"]/div[1]/button")).click();
	}


	@And("product should be added to the wishlist")
	public void product_should_be_added_to_the_wishlist() {
		pg1.wishlist();
		
	}

	@And("select a product from the Wishlist")
	public void select_a_product_from_the_wishlist() {
		System.out.println("Selecting a product from the wishlist");
	}

	@And("add the product to the cart")
	public void add_the_product_to_the_cart() throws InterruptedException {
	    pg1.wishlist_to_cart();
	}

	@And("product should added to cart")
	public void product_should_added_to_cart() {
		System.out.println("Product is added to the cart");
	}

	@And("shop the product from the cart")
	public void shop_the_product_from_the_cart() {
		pg1.clickCheckout();
	}
	
	@And("^enters shipping details with first name \"([^\"]*)\", last name \"([^\"]*)\", address \"([^\"]*)\", state \"([^\"]*)\", and pincode (\\d+)$")
	public void enters_shipping_details_with_first_name_last_name_address_state_and_pincode(String fname, String lname, String addr, String state, Integer pincode) {
		pg1.ShippingAddress(fname, lname, addr, state, String.valueOf(pincode));
        
	}

	@When("place the order after submitting the details")
	public void place_the_order_after_submitting_the_details() {
		System.out.println("ordered has been placed successfuly");
	}

	@Then("Successfuly ordered aproduct from vendors and added it to wishlist and then ordered from the wishlist")
	public void successfuly_ordered_aproduct_from_vendors_and_added_it_to_wishlist_and_then_ordered_from_the_wishlist() {
		System.out.println("Searched a product from the vendors, added the product wishlist to cart and ordered it");
		driver.quit();
	}

}






