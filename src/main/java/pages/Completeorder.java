package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Completeorder {
	protected WebDriver driver;
	protected WebDriverWait wait;

private By btn_completeorder=By.xpath("//*[text()='Complete my order']");

public Completeorder(WebDriver driver7) {
	this.driver=driver;
}

public void completeorder() {
	
	driver.findElement(btn_completeorder).click();
}







}
