package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice8 {
	public static void main(String[] args) {
		WebDriver driver = Practice.OpenBrowser("https://www.linkedin.com/pub/dir/+/+?trk=homepage-basic_guest_nav_menu_people");
	    WebElement searchbox = driver.findElement(By.className("dismissable-input search-input"));
	    boolean result = searchbox.isEnabled();
	    System.out.println(result);
	
	}

}
