package pages;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SelectDate {
protected WebDriver driver;
protected WebDriverWait wait;
private By selec_selectdate=By.xpath("//*[@data-cy='DatePickerWrapper']");
private By selec_datepicker=By.xpath("//*[text()='+todayInt+']");
public SelectDate(WebDriver driver2) {
	this.driver=driver;
	
}
	
   
public void selectdate() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(selec_selectdate).click();
	}
	
	public void selectodaydate() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(selec_datepicker).click();
	}
	
	
}
