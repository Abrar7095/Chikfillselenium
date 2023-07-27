package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Guestcheckouts  {
	protected  RemoteWebDriver driver;
	protected WebDriverWait wait;
private By clk_clickoncart=By.xpath("//*[@data-cy='badge']");

private By btn_clickoncheckoutbtn= By.xpath("//*[@data-cy='CheckOut']");

public Guestcheckouts(RemoteWebDriver driver5) {
	this.driver=driver5;
}
 
 public void clickoncart() {
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	 
	 
	 driver.findElement(clk_clickoncart).click();
 }
public void clickoncheckoutsbtn() {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	  driver.findElement(btn_clickoncheckoutbtn).click();
}
 


}

