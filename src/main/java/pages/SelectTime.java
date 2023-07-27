package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SelectTime {
protected WebDriver driver;
protected WebDriverWait wait;
 
private By sele_selecttime=By.xpath("//*[@data-cy='TimeSelectionDropdown']");
private By btn_continuebtn= By.xpath("//*[@data-cy='Continue']"); 	
	
	public SelectTime(WebDriver driver3) {
		this.driver=driver;
	}
	
	public void selecttime() {
		
		driver.findElement(sele_selecttime).click();
	
	}
	
	public void continuebtn() {
		driver.findElement(btn_continuebtn).click();
	}
	
}
