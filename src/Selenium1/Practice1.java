package Selenium1;

import org.openqa.selenium.WebDriver;

public class Practice1 {
	public static void main(String[] args) {
		WebDriver driver = Practice.OpenBrowser("https://www.javatpoint.com/");
		driver.navigate().back();
	}

}
