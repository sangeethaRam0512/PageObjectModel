package amcInstantWin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestAmc {
	
	@Test
	public void playGame() throws InterruptedException
	{
System.setProperty("webdriver.gecko.driver", "C:\\Selenium_learning\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		AmcPageObjects page =new AmcPageObjects(driver);
		
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://us.coca-cola.com/amoe?promotionId=8417_amc_iw_63987");
		driver.manage().window().maximize();
		Thread.sleep(3000); 
		
	page.signIn();
	Thread.sleep(5000);
	page.userName("ramsaran0512@gmail.com");
	page.enterPassword("Charges@1");
	page.signInwithEmail();
	Thread.sleep(7000);
	page.clickMyEntry();
	Thread.sleep(7000);
	page.clickRedeem();
	
	 int i=50;
	 for(i=0; i<=50; i++)
		 
	 {
		 
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 page.clickMyEntry();
		 Thread.sleep(6000);
		 page.clickRedeem();
		 Thread.sleep(3000);
		 
		 
	 }
		
		
		
		
		
		
		
		
		
	}

}
