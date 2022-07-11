package Test;

import org.openqa.selenium.WebDriver;

import POM.LinkDineSign;
import Selenium1.Practice;

public class LinkdineLoginTest {
	
	public void LoginTest() {
		WebDriver driver = Practice.OpenBrowser("https://www.linkedin.com/");
		LinkDineSign link = new LinkDineSign(driver);
		link.enterEmailId("atul");
		link.enterPass("Atul@123456");
		link.clickOnSingIn();
	}
	
	public static void main(String[] args) {
		LinkdineLoginTest ts = new LinkdineLoginTest();
		ts.LoginTest();
		
		
	}

}
