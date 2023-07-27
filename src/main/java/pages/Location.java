package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Location  {
	protected WebDriver driver;
	protected WebDriverWait wait;
	
private By txt_Location= By.xpath("//*[@data-cy='LocationSearch']");
private  By btn_FindResturant= By.xpath("//*[@data-cy='FindRestaurants']"); 
private By btn_SelectResturant=By.xpath("//*[@data-cy='SelectThisRestaurant']");	
	
	public Location(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public void enterLocation(String Location) {
		driver.findElement(txt_Location).sendKeys("Location");
		
	}

    public void FindResturant() {
    	driver.findElement(btn_FindResturant).click();
    }
   
    public void SelectResturant(String Select) {
    	
    	driver.findElement(btn_SelectResturant).click();
    	
    }
}
