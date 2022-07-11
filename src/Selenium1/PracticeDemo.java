package Selenium1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Practice.OpenBrowser("https://www.redbus.in/");
		Thread.sleep(3000);
		WebElement from=driver.findElement(By.xpath("//input[@id='src']"));
		from.sendKeys("jalgaon");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("pune");
		Thread.sleep(3000);
		WebElement date=driver.findElement(By.xpath("//input[@id='onward_cal']"));
		date.sendKeys("10-Jun-2022");
		date.click();
		
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		
		

   }

}