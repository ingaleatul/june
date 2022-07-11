package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice6 {
	public static void main(String[] args)  {
		WebDriver driver = Practice.OpenBrowser("https://www.linkedin.com/login");
	    //WebElement email = driver.findElement(By.xpath("//input[@name='session_key']"));
	   // xpath by attribute syntax-//tagname[@attribute="attributevalue"]
	   //WebElement login = driver.findElement(By.xpath("//button[text()='Sign in']"));
	   //login.click();
	  //xpath bu text syntax-//tagname[text()='textvalue'](we can use ' or " comos).
		WebElement login = driver.findElement(By.xpath(("(//input[contains(@name,session)])[13]")));
		login.sendKeys("Atul");
		//xpath by contains suntax-//tagname[contains@attributename,partialattributevalue)].
		//xpath by index syntax- (any xpath Expression)[index number where our element is located.
		
		
		
	    
	    
	    
	 
	    
	
	
	}

}
