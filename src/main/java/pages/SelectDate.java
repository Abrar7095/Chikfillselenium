package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SelectDate {
private static final String todayInt = null;
protected static RemoteWebDriver driver;
protected static WebDriverWait wait;
private By selec_selectdate=By.xpath("//*[@data-cy='DatePickerWrapper']");
//private By selec_datepicker=By.xpath("//*[text()='"+todayInt+"']");
public SelectDate(RemoteWebDriver driver2) {
	this.driver= driver2;
	
}
	
   
public void selectdate() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(selec_selectdate).click();
	}
	
//	public void selectodaydate() throws InterruptedException {
	//	Thread.sleep(20000);
		//driver.findElement(selec_datepicker).click();
	//}
	
	
}
