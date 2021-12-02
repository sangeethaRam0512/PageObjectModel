package amcInstantWin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmcPageObjects {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"mainContent\"]/main/div/div[1]/div/div/div[2]/div[3]/a")
	WebElement signIn;
	
	@FindBy(id="signInName")
	WebElement userName;

	
	@FindBy(id="password")
	WebElement passWord;
	
	@FindBy(id="next")
	WebElement signInWithEmail;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div/main/div/div[1]/div/div/div[1]/div[4]/button")
	WebElement useMyEntry;
	
	
	@FindBy(xpath="//button[contains(text(), 'Redeem')]")
	WebElement redeem;
	
	AmcPageObjects(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void signIn() {
		signIn.click();
	}
	public void userName(String name) {
		userName.sendKeys(name);
	}
	
	
		
	public void enterPassword(String Passwd) {
		passWord.sendKeys(Passwd);
	}
	
	public void signInwithEmail()
	{
		signInWithEmail.click();
	}
	
	public void clickMyEntry() {
		useMyEntry.click();
		
	}
	public void clickRedeem()
	{
		redeem.click();
	}
	
	
	
}
