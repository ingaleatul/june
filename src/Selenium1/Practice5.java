package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice5 {
	public static void main(String[] args) {
		WebDriver driver = Practice.OpenBrowser("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		WebElement email = driver.findElement(By.cssSelector("input[id='username']"));
		email.sendKeys("Atul");
		
	}

}
