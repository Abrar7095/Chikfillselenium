package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class GetStart  {
	protected RemoteWebDriver driver;
	protected WebDriverWait wait;
private By btn_Cateringbtn = By.xpath("//button[@data-cy='Catering']");
private	By btn_Caterpickupbtn= By.xpath("//button[@data-cy='Catering Pickup']");
	
	public GetStart(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	
	public void catering() {
		driver.findElement(btn_Cateringbtn).click();
		
	} 

	public void caterpickup() {
		driver.findElement(btn_Caterpickupbtn).click();
	}
}
