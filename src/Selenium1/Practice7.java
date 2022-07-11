package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice7 {
	public static void main(String[] args) {
		WebDriver driver = Practice.OpenBrowser("https://www.linkedin.com/login");
		//Absolute xpath-make whole html tree to find the absolute xpath.
//		WebElement button = driver.findElement(By.xpath("/html/body/div/main/div/div/form/div[3]/button"));
//		button.click();
		
		//Relative xpath-to make nearest root to html tree.
		WebElement login = driver.findElement(By.xpath("//html//div//button"));
		login.click();
		
		
	}

}
