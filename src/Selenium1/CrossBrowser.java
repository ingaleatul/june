package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {
	public static void main(String[] args) throws Exception {
		
		String browser="chrome";
		
		if(browser.equalsIgnoreCase("firefox"))
			{
			   System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			   WebDriver driver = new FirefoxDriver();
			   driver.get("https://www.facebook.com/");
				}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");
		}
		else 
		{
			throw new Exception("Browser is not correct");
		}
		
	}

}
