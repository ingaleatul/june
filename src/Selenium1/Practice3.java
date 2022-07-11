package Selenium1;

import org.openqa.selenium.WebDriver;

public class Practice3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Practice.OpenBrowser("https://www.linkedin.com/");
		
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.close();
	}

}
