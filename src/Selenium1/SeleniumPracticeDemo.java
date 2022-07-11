package Selenium1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SeleniumPracticeDemo {
	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = Practice.OpenBrowser("https://www.linkedin.com/");
	FileInputStream file = new FileInputStream("D:\\Velocity Software Testing Class\\TestData.xlsx");
	Sheet value = WorkbookFactory.create(file).getSheet("Atul");
	
	
	String email = value.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys(email);
	


    String password = value.getRow(1).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='session_password']")).sendKeys(password);
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
    
		
		
		 
	
	}

}
