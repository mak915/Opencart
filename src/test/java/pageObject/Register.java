package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends BasePage {

	WebDriver driver;
	
	public Register(WebDriver driver) {
		
		super(driver);
	}
	
	
	
	@FindBy(xpath="//input[@class='r4vIwl BV+Dqf']")
	WebElement username;
	
	public void userName(String user) {
		username.sendKeys(user);;
	}
	
	
}
