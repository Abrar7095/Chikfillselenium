package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Mastercard  {
	protected static RemoteWebDriver driver;
	protected static WebDriverWait wait;

private By btn_clickonguestcheckoutbtn=By.xpath("//*[@data-cy='GuestCheckout']");

private By txt_enterfirstname=By.xpath("//*[@data-cy='FirstNameInput']");

private By txt_enterlastname=By.xpath("//*[@data-cy='LastNameInput']");

private By txt_enterphoneno=By.xpath("//*[@data-cy='PhoneInput']");

private By txt_enteremail= By.xpath("//*[@data-cy='EmailInput']");

private By txt_enterconfirmemail=By.xpath("//*[@data-cy='ConfirmEmailInput']");

private By clik_clickoncheckbox=By.xpath("//*[@data-cy='Agree']");

private By btn_continuebtn=By.xpath("//*[@data-cy='Continue']");

private By btn_proceedpaymentbtn=By.xpath("//*[@data-cy='ProceedToPayment']");

private By btn_paymentmethod=By.xpath("//*[@data-cy='AddPayment']");

private By txt_entercardname=By.xpath("//*[@id='ccName']");

private By txt_entercardno=By.xpath("//*[@id='ccNum']");

private By txt_expirydate=By.xpath("//*[@id='expiry']");

private By txt_entercvvno=By.xpath("//*[@id='cvv']");

private By txt_enterzipcode=By.xpath("//*[@id='zip']");

private By btn_clikondonebtn=By.xpath("//*[text()='Done']");

public Mastercard(RemoteWebDriver driver6) {
   this.driver=driver6;	
}

public void Guestcheckoutbtn() {
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(btn_clickonguestcheckoutbtn).click();
}
public void enterfirstname() {
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(txt_enterfirstname).sendKeys("PWO");
}

public void enterlastname() {
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(txt_enterlastname).sendKeys("TestUser");
}

public void enterphoneNo() {
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(txt_enterphoneno).sendKeys("1234567890");
}
public void enteremail() {
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(txt_enteremail).sendKeys("Pwo-us-ffdd00ee@mailinator.com");
}
public void enterconfirmemail() {
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(txt_enterconfirmemail).sendKeys("Pwo-us-ffdd00ee@mailinator.com");
}
public void clickoncheckbox() {
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	driver.findElement(clik_clickoncheckbox).click();
	
}
public void clikoncontinuebtn() {
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(btn_continuebtn).click();
}

public void proceedpaymentbtn() {
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(btn_proceedpaymentbtn).click();
	driver.get("https://order.chick-fil-astage.com/order/payment");
	//By finding all the web elements using iframe tag
	List<WebElement> iframeElements = driver.findElements(By.tagName("iframeResult"));
	System.out.println("Total number of iframes are " + iframeElements.size());

	//By executing a java script
	JavascriptExecutor exe = (JavascriptExecutor) driver;
	Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
	System.out.println("No. of iframes on the page are " +noOfFrames);
}
public void paymentmethod() {
	 driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);

	driver.findElement(btn_paymentmethod).click();
	
	 driver.switchTo().frame("targetFrame");
}

public void cardname() {
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.findElement(txt_entercardname).sendKeys("Mastercard");
}

public void cardno() {
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.findElement(txt_entercardno).sendKeys("5204240250197865");
	}

public void cardexpirydate() {
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.findElement(txt_expirydate).sendKeys("10/25");
}
public void entercvvno() {
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.findElement(txt_entercvvno).sendKeys("444");
}

public void enterzipcode() {
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.findElement(txt_enterzipcode).sendKeys("00000");
}

public void clickondonebtn() {
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.findElement(btn_clikondonebtn).click();
}






}
