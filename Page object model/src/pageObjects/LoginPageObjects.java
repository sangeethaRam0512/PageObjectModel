package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	
	@FindBy(name="email")
	public static WebElement usermame;
	
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
	public static WebElement submit;
	
}
