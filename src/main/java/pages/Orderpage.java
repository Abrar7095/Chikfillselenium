package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Orderpage {
protected WebDriver driver;
protected WebDriverWait wait;
private By sele_Selecttray=By.xpath("//*[@data-cy='OLO_TRAYS']");

private By sele_NuggtsTrays=By.xpath("//*[@data-cy='NUGGET_TRAYS']");

private By btn_clickorder=By.xpath("//*[@data-cy='AddToOrder']");

private By btn_skipsauce=By.xpath("//*[@data-cy='PrimaryConfirmButton']");

    public Orderpage(WebDriver driver4) {
	this.driver=driver;
}

   public void selecttrays(String trays) {
	   driver.manage().timeouts().implicitlyWait(60,null);
	  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	   driver.findElement(sele_Selecttray).click();
   }
   
   public void Nuggutstray(String Nuggetstray) {
	   driver.manage().timeouts().implicitlyWait(20,null);
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.findElement(sele_NuggtsTrays).click();
	   
   }

  public void clickorder() {
	  driver.manage().timeouts().implicitlyWait(20,null);
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  
	  driver.findElement(btn_clickorder).click();
  }
  
  public void skipsauce() {
	  driver.manage().timeouts().implicitlyWait(20,null);
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  
	  driver.findElement(btn_skipsauce).click();
  }
  
  
}
