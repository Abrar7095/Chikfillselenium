package Steps;

import java.lang.StackWalker.Option;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Completeorder;
import pages.GetStart;
import pages.Guestcheckouts;
import pages.Location;
import pages.Mastercard;
import pages.Orderpage;
import pages.SelectDate;
import pages.SelectTime;
import pages.cookiesbtn;


public class Seleniumchik2_pom  {

	protected RemoteWebDriver driver;
	protected WebDriverWait wait;
	cookiesbtn cookies;
	GetStart GetStart;
	Location location;
	Orderpage order;
	Mastercard card;
	Completeorder cmp;
	
	
	@Given("I am accessing the site as a guest and select the {string} option on the {string} page")
	public void i_am_accessing_the_site_as_a_guest_and_select_the_option_on_the_page(String string, String string2) {
	      
		System.out.println("=== i am in seleniumchik_pom===");
		
		driver = new ChromeDriver();
		driver.get("https://order.chick-fil-astage.com/get-started");
      Options manage = ((RemoteWebDriver) driver).manage();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);  
         manage.window().maximize();
		
		
		
		
		
	}

	private Option WebDriverWait(WebDriver driver2, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Given("I accept all cookies catering pickup page")
	public void i_accept_all_cookies_catering_pickup_page() {
		//driver.manage().timeouts().implicitlyWait(20,null);
		//driver.findElement(By.xpath("//*[text()='Accept All Cookies']")).click();
		// cookies= new cookiesbtn(driver); 
		 //cookies.acceptcookies();
	}

	@Given("I select {string} option on the Catering page")
	public void i_select_option_on_the_catering_page(String string) throws InterruptedException {
	
		 GetStart = new GetStart(driver);
		
		GetStart.catering();
		GetStart.caterpickup();
		
		//driver.findElement(By.xpath("//button[@data-cy='Catering']")).click();   	
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//button[@data-cy='Catering Pickup']")).click();   	
		    Thread.sleep(5000);
		  
	}

	@Given("I select location {string}")
	public void i_select_location(String string) throws InterruptedException {
	
	Location location = new Location(driver);
	
	location.enterLocation(string);
	location.FindResturant();
	location.SelectResturant(string);
		
		/*driver.findElement(By.xpath("//*[@data-cy='LocationSearch']")).sendKeys("@03351");
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@data-cy='FindRestaurants']")).click();
	   Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@data-cy='SelectThisRestaurant']")).click();
			*/
	
	}

	@Given("I select a date")
	public void i_select_a_date() throws InterruptedException {
		
		SelectDate selec= new SelectDate(driver);
	Thread.sleep(5000);  
	selec.selectdate();	
	Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
	        
		
		//selec.selectodaydate();
		
		
		//driver.findElement(By.xpath("//*[@data-cy='DatePickerWrapper']")).click();
		driver.findElement(By.xpath("//*[text()='"+todayInt+"']")).click();
			
	
	}

	@Given("I select a time")
	public void i_select_a_time() throws InterruptedException {
		
		SelectTime seltm= new SelectTime(driver);

		Thread.sleep(7000);
		seltm.selecttime();

		//driver.findElement(By.xpath("//*[@data-cy='TimeSelectionDropdown']")).click();
		
		Select sel = new Select(driver.findElement(By.xpath("//*[@data-cy='TimeSelectionDropdown']")));
		sel.selectByIndex(1);
	    Thread.sleep(5000);
	    //driver.findElement(By.xpath("//*[@data-cy='Continue']")).click();
	    seltm.continuebtn();
	}

	@Given("I add a {string} from the {string} category to my order and view my order")
	public void i_add_a_from_the_category_to_my_order_and_view_my_order(String string, String string2) throws InterruptedException {
		Thread.sleep(80000);
		
		Orderpage order=new Orderpage(driver);
		
		order.selecttrays(string2);
		order.Nuggutstray(string);
		order.clickorder();
		order.skipsauce();
		
		
		/*driver.findElement(By.xpath("//*[@data-cy='OLO_TRAYS']")).click();
		// click on nugget trays
	    driver.findElement(By.xpath("//*[@data-cy='NUGGET_TRAYS']")).click();
	    Thread.sleep(15000);
	// click on add to order
	    driver.findElement(By.xpath("//*[@data-cy='AddToOrder']")).click();
	    Thread.sleep(15000);
	// click on skip sauces
	    driver.findElement(By.xpath("//*[@data-cy='PrimaryConfirmButton']")).click();
	   
	*/
	}

	@Given("I select guest checkout for catering")
	public void i_select_guest_checkout_for_catering() {
	
		Guestcheckouts guest =new Guestcheckouts(driver);
		
		guest.clickoncart();
		guest.clickoncheckoutsbtn();
		
		
		/*// click on cart
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@data-cy='badge']")).click();
	   
	   // click on checkout button
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@data-cy='CheckOut']")).click();	
	    */
	    }

	@Given("I checkout as a Catering guest with a mastercard")
	public void i_checkout_as_a_catering_guest_with_a_mastercard() throws InterruptedException {
		
		card =new Mastercard(driver);
		
		card.Guestcheckoutbtn();
		card.enterfirstname();
		card.enterlastname();
		card.enterphoneNo();
		card.enteremail();
		card.enterconfirmemail();
		card.clickoncheckbox();
		card.clikoncontinuebtn();
		card.proceedpaymentbtn();
		card.paymentmethod();
		card.cardname();
		card.cardno();
		card.cardexpirydate();
		card.entercvvno();
		card.enterzipcode();
		card.clickondonebtn();
		
		// click on guest checkout
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@data-cy='GuestCheckout']")).click();
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
	    	// enter first Guest name
		 //driver.findElement(By.xpath("//*[@data-cy='FirstNameInput']")).sendKeys("PWO");
		 //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
	         // enter last guest name
		 //driver.findElement(By.xpath("//*[@data-cy='LastNameInput']")).sendKeys("TestUser");		
		 //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	        // enter phone No
		// driver.findElement(By.xpath("//*[@data-cy='PhoneInput']")).sendKeys("1234567890");
	 //	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 	 // generate randomly email
		     // emailTextBx.findElement(By.xpath("//*[@data-cy='EmailInput']")).click();  
		 	//Random randomGenerator = new Random();  
		 	//int randomInt = randomGenerator.nextInt(1000);  
		 	//emailTextBx.sendKeys("PWOtestUser"+ randomInt +"@gmail.com");   
           
		 	 // enter email
	  	// driver.findElement(By.xpath("//*[@data-cy='EmailInput']")).sendKeys("Pwo-us-ffdd00ee@mailinator.com");
	  	// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	        // enter confirm email
       // driver.findElement(By.xpath("//*[@data-cy='ConfirmEmailInput']")).sendKeys("Pwo-us-ffdd00ee@mailinator.com");
      //  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	       // click on check box
	  //   driver.findElement(By.xpath("//*[@data-cy='Agree']")).click();
          // click on continue button
      //  driver.findElement(By.xpath("//*[@data-cy='Continue']")).click();
		 // Click on proceed payment button
		//	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
	//		driver.findElement(By.xpath("//*[@data-cy='ProceedToPayment']")).click();
		
			
		driver.get("https://order.chick-fil-astage.com/order/payment");
			//By finding all the web elements using iframe tag
			List<WebElement> iframeElements = driver.findElements(By.tagName("iframeResult"));
			System.out.println("Total number of iframes are " + iframeElements.size());

			//By executing a java script
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
			System.out.println("No. of iframes on the page are " +noOfFrames); 
				// click on payment Method button
			 driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		   //  driver.findElement(By.xpath("//*[@data-cy='AddPayment']")).click();
		    Thread.sleep(7000);
		    driver.switchTo().frame("targetFrame");
		    // Enter Card Name In iframe 
		   // driver.findElement(By.xpath("//*[@id='ccName']")).sendKeys("Mastercard");
          
		    // Enter card number
		   // driver.findElement(By.xpath("//*[@id='ccNum']")).sendKeys("5204240250197865");
	      
		    // enter expiry date
		   // driver.findElement(By.xpath("//*[@id='expiry']")).sendKeys("10/25");
	 
		    // enter cvv number
        //	driver.findElement(By.xpath("//*[@id='cvv']")).sendKeys("444");
	   
        	// enter zip code
        	//driver.findElement(By.xpath("//*[@id='zip']")).sendKeys("00000");
	// click on done button
    //    	driver.findElement(By.xpath("//*[text()='Done']")).click();

	}

	@Then("The order is complete")
	public void the_order_is_complete() throws InterruptedException {
		
		Completeorder cmp=new Completeorder(driver);
		
		cmp.completeorder();
		Thread.sleep(5000);			
		driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//*[text()='Complete my order']")).click();
	 
	}
}
