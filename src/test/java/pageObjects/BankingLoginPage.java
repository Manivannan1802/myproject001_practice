package pageObjects;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class BankingLoginPage {
	public WebDriver ldriver;
	public BankingLoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);

	}
 
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement username;
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement loginButton;
	@FindBy(xpath="//a[text()='Log out']")
	@CacheLookup
	WebElement logoutButton;
	public void setUserName(String username1)
	{
		username.sendKeys(username1);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
 
	public void loginButton()
 
	{
	loginButton.click();
	}
	public void logoutButton()
 
	{
	logoutButton.click();
	}


}