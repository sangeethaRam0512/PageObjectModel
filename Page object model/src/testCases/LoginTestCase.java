package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LoginTestCase {

	@Test
	public void loginPage() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_learning\\NEWCHROME\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://phptravels.net/login");
		
		Thread.sleep(5000);
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.usermame.sendKeys("san@gmail.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.submit.click();
		
		
	}
	
	
}
