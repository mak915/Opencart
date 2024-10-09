package testcase;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.Register;

public class RegisterTC1 extends BaseClass {
	
 
	
	
	@Test
	public void refistrationMethod() {
		logr.info("tc startd");
		Register rg =new Register(driver);
		rg.userName(randomString());
		
		logr.info("tc ended");
	}
	
	
	public String randomString() {
		String un=RandomStringUtils.randomAlphabetic(5);
		return un;
	}

}
