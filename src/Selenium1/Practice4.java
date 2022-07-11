package Selenium1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Practice4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Practice.OpenBrowser("https://www.linkedin.com/");
		
		Dimension d = new Dimension(300,400);
		driver.manage().window().setSize(d);
		
		Thread.sleep(3000);
		Point p = new Point(500,500);
		driver.manage().window().setPosition(p);
		
	
	}

}
