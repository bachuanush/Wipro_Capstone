package StepDefination;



import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;

import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Page {
    WebDriver driver;
    WebDriverWait wait;
    
    public Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

  
    By signin = By.id("signin");
    By userField = By.id("username");
    By passField = By.id("password");
    By loginBtn = By.id("login-btn");
    By logoutBtn = By.xpath("//span[text()='Logout']");
    
    By searchField = By.cssSelector("input[placeholder=\"Search\"]");	
    By searchBtn = 	By.cssSelector("button[class=\"px-4 py-1 bg-gray-100 border border-l-0 border-gray-300\"]");
    
    By AddToCart = By.xpath("//*[@id=\"1\"]/div[4]");
    By deleteFromCart = By.cssSelector("div[class=\"shelf-item__del\"]");
    By checkout = By.xpath("//div[@class='buy-btn']");

	 By selectProduct = By.xpath("//*[@id=\"23\"]/div[1]/button");
    
    By FirstName = By.id("firstNameInput");
    By LastName = By.id("lastNameInput");
    By addressline = By.id("addressLine1Input");
    By state = By.id("provinceInput");
    By postalCode = By.id("postCodeInput"); 
    By submit = By.id("checkout-shipping-continue");
    
    
    By apple = By.xpath("//span[@class='checkmark'][1]");
    By samsung = By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[2]/label/span");
    By google = By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[3]/label/span");
    By oneplus = By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[4]/label/span");
    
    
    By orders = By.cssSelector("a[id='orders'][class='Navbar_link__3Blki menu-item']");
    
    By privacyPolicyReadMore = By.xpath("//a[text()='Read More']");
    By newsletter = By.id("newsletter-email");
    
    By increaseProductBtn = By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div[1]/div[4]/div/button[2]");
    By opcartBtn = By.xpath("//span[@class='bag bag--float-cart-closed']"); 
    By clscartBtn = By.xpath("//div[@class='float-cart__close-btn']");
    
    
    By select = By.partialLinkText("Select");
    By LowtoHigh = By.xpath("//*[@id=\"__next\"]/div/div/main/div[2]/div[1]/div[1]/select");
    By HightoLow = By.xpath("//*[@id=\"__next\"]/div/div/main/div[2]/div[1]/div[1]/select");
    By offersBtn = By.cssSelector("a#offers");
    By offerspage = By.cssSelector("div.p-6");
    
    By ProductFavIcon = By.cssSelector("div[id='6'] svg[class='MuiSvgIcon-root Icon']");
    By favMenuBtn = By.xpath("//strong[text()='Favourites']"); 
    By favRemoveBtn = By.cssSelector("div[id='1'] svg[class='MuiSvgIcon-root Icon']");   
    By FavBtn = By.id("favourites");
   
    By orderReceiptBtn = By.id("downloadpdf");
  //By continueBtn = By.xpath("//button[text()='Continue Shopping »']");
    
    By lockedstatus = By.xpath("//h3[text()='Your account has been locked.']");
    
    public void login_page()  {
    	//driver.get("https://bstackdemo.com/signin");
    	WebElement lg = wait.until(ExpectedConditions.elementToBeClickable(signin));
    	lg.click();
    }
    
    public void Login_1() throws InterruptedException {      
    	       wait.until(ExpectedConditions.elementToBeClickable(userField)).click();
                driver.findElement(By.xpath("//div[text()='demouser']")).click();
                driver.findElement(passField).click();
                driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
                driver.findElement(loginBtn).click();
            }
    public void user2() throws InterruptedException {      
    	wait.until(ExpectedConditions.elementToBeClickable(userField)).click();
        driver.findElement(By.xpath("//div[text()='image_not_loading_user']")).click();
        driver.findElement(passField).click();
        driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
        driver.findElement(loginBtn).click();
    }
    public void user3() throws InterruptedException {      
    	wait.until(ExpectedConditions.elementToBeClickable(userField)).click();
        driver.findElement(By.xpath("//div[text()='existing_orders_user']")).click();
        driver.findElement(passField).click();
        driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
        driver.findElement(loginBtn).click();
    }
    public void user4() throws InterruptedException {      
    	wait.until(ExpectedConditions.elementToBeClickable(userField)).click();
        driver.findElement(By.xpath("//div[text()='fav_user']")).click();
        driver.findElement(passField).click();
        driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
        driver.findElement(loginBtn).click();
    }
    public void user5() throws InterruptedException {      

    	wait.until(ExpectedConditions.elementToBeClickable(userField)).click();
        driver.findElement(By.xpath("//div[text()='locked_user']")).click();
        driver.findElement(passField).click();
        driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
        driver.findElement(loginBtn).click();
    }
    

    public void Logout() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(logoutBtn).click();
    }
    
    public void srch_items() {	
		   ArrayList<String> items = new ArrayList<>();
	        items.add("tabs");
	        items.add("games");
	        items.add("laptop");
	        items.add("phones");
	        for (String item : items) {
	        	WebElement sb = wait.until(ExpectedConditions.elementToBeClickable(searchField));
	            sb.clear();
	            sb.sendKeys(item);
	            driver.findElement(searchBtn).click();
	        }
    }
    
    public void newsLetter() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	
    	WebElement NL = driver.findElement(newsletter);
    	NL.sendKeys("anushmail@gmail.com");
    //	NL.sendKeys(Keys.ENTER);
    }
    
    public void increase_product_qty_in_cart() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	WebElement plusButton = wait.until(ExpectedConditions.elementToBeClickable(increaseProductBtn));
    	for (int i = 1; i < 9; i++) {
    	    plusButton.click();
    	    Thread.sleep(500); 
    	}
    }

    public void selectlowtohigh() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	WebElement lowtohigh = driver.findElement(LowtoHigh);
     	Select sel=new Select(lowtohigh);
     	sel.selectByValue("lowestprice");
    }
    public void selecthightolow() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	WebElement lowtohigh = driver.findElement(HightoLow);
     	Select sel=new Select(lowtohigh);
     	sel.selectByValue("highestprice");
    }
    
    public void wishlist() {
    	driver.findElement(FavBtn).click();
    }
    
    public void orders_page() throws InterruptedException {
    	WebElement order = wait.until(ExpectedConditions.elementToBeClickable(orders));
    	order.click();	
    	}
    
    
    public void Offers() throws InterruptedException {
    	Thread.sleep(5000);
        driver.findElement(offersBtn).click();
    }

    public void privacy_policy() throws InterruptedException {
        driver.findElement(privacyPolicyReadMore).click();
        Thread.sleep(2000);
    }

    public void clickOrderReceipt() {
        driver.findElement(orderReceiptBtn).click();
    }

//    public void clickContinue() {
//        driver.findElement(continueBtn).click();
//    }
    

    public void addProductToCart() {
        driver.findElement(AddToCart).click();
    }

    public void openCart() {
        driver.findElement(opcartBtn).click();
    }
    public void closeCart() {
    	driver.findElement(clscartBtn).click();
    }

    public void removeProductFromCart() {
        driver.findElement(deleteFromCart).click();
    }
    public void clickCheckout() {
        driver.findElement(checkout).click();
    }
    
    public void ShippingAddress(String fname, String lname, String addr, String states, String pincode) {
        driver.findElement(FirstName).clear();
        driver.findElement(FirstName).sendKeys(fname);

        driver.findElement(LastName).clear();
        driver.findElement(LastName).sendKeys(lname);

        driver.findElement(addressline).clear();
        driver.findElement(addressline).sendKeys(addr);

        driver.findElement(state).clear();
        driver.findElement(state).sendKeys(states);

        driver.findElement(postalCode).clear();
        driver.findElement(postalCode).sendKeys(pincode);

        driver.findElement(submit).click();
    }

    public void addProductToFavourites() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,400);");
        driver.findElement(ProductFavIcon).click();
    }

    public void openFavourites() {
        driver.findElement(favMenuBtn).click();
    }

    public void removeProductFromFavourites() {
        driver.findElement(favRemoveBtn).click();
    }
    
    //Shop by brands Methods
    public void ShopByVendors() throws InterruptedException {
    	//Thread.sleep(2000);
    	WebElement p3 = wait.until(ExpectedConditions.elementToBeClickable(samsung));
		p3.click();
		
    	JavascriptExecutor js4 = (JavascriptExecutor) driver;
    	js4.executeScript("window.scrollBy(0,200);");
    	WebElement p4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"14\"]/div[4]")));
		p4.click();
		
		
    	//Thread.sleep(2000);
    	WebElement p1 = wait.until(ExpectedConditions.elementToBeClickable(apple));
        p1.click();
    	WebElement p2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"8\"]/div[4]")));
		p2.click();
		
		
		//Thread.sleep(2000);
    	WebElement p7 = wait.until(ExpectedConditions.elementToBeClickable(oneplus));
		p7.click();
    	WebElement p8 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"25\"]/div[4]")));
		p8.click();
    	//Thread.sleep(2000);
    	
    	   	
    	//Thread.sleep(2000);
    	WebElement p5 = wait.until(ExpectedConditions.elementToBeClickable(google));
		p5.click();
    	WebElement p6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"19\"]/div[4]")));
		p6.click();  	   	
    }
    
  
    public void ShopByVendor() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(oneplus).click();
    	Thread.sleep(2000);
    	   	
    }

    public void wishlist_to_cart() throws InterruptedException {
    	Thread.sleep(5000);
    	JavascriptExecutor js8 = (JavascriptExecutor) driver;
    	js8.executeScript("window.scrollBy(0, 400);");
    	driver.findElement(By.className("shelf-item__buy-btn")).click();
    }

	public void select_product() {
    	driver.findElement(selectProduct).click();
    }
}

