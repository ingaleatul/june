package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkDineSign {
	WebDriver driver;
	@FindBy (xpath = "//input[@id='session_key']") private WebElement email;
	@FindBy (xpath ="//input[@id='session_password']") private WebElement password;
	@FindBy (xpath = "//button[@class='sign-in-form__submit-button']") private WebElement signIn;
	
	public LinkDineSign(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailId(String EmailId) {
		email.sendKeys(EmailId);
	}
	
	public void enterPass(String Pass) {
		password.sendKeys(Pass);
	}
	public void clickOnSingIn() {
		signIn.click();
	}

}
