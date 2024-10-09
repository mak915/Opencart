package testcase;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public org.apache.logging.log4j.Logger logr;
	
WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		logr=LogManager.getLogger(this.getClass());	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
