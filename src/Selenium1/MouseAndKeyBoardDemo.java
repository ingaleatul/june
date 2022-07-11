package Selenium1;

import java.util.ArrayList;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MouseAndKeyBoardDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Practice.OpenBrowser("https://www.yatra.com/");
	    WebElement visa = driver.findElement(By.xpath("//a[@id='booking_engine_visa']"));
	    visa.click();
	    visa.click();
	    visa.click();
	    
	    @SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList al = new ArrayList(driver.getWindowHandles());
	    System.out.println(al.get(1));
	    driver.switchTo();
	}

}
