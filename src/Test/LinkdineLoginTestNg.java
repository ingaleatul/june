package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.LinkDineSign;
import Selenium1.Practice;

public class LinkdineLoginTestNg {
	
	WebDriver driver;
	
	@BeforeMethod
	public void luanchBrowser() {
		driver = Practice.OpenBrowser("https://www.linkedin.com/");
	}
	
	@Test
	public void LoginTest() {
		LinkDineSign link = new LinkDineSign(driver);
		link.enterEmailId("atul");
		link.enterPass("Atul@123456");
		link.clickOnSingIn();
	}

}
