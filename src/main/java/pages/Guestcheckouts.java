package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Guestcheckouts  {
	protected WebDriver driver;
	protected WebDriverWait wait;
private By clk_clickoncart=By.xpath("//*[@data-cy='badge']");

private By btn_clickoncheckoutbtn= By.xpath("//*[@data-cy='CheckOut']");

public Guestcheckouts(WebDriver driver5) {
	this.driver=driver;
}
 
 public void clickoncart() {
	  driver.manage().timeouts().implicitlyWait(30,null);
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 
	 
	 driver.findElement(clk_clickoncart).click();
 }
public void clickoncheckoutsbtn() {
	driver.manage().timeouts().implicitlyWait(20,null);
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    
	  driver.findElement(btn_clickoncheckoutbtn).click();
}
 


}

