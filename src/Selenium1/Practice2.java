package Selenium1;

import org.openqa.selenium.WebDriver;

public class Practice2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Practice.OpenBrowser("https://www.linkedin.com/");
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
	}

}
