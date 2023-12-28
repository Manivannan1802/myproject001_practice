package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("^user launch chrome browser$")
	public void user_launch_chrome_browser()  {
	
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		lp=new LoginPage(driver);
	
	}

	@When("^user open url  \"([^\"]*)\"$")
	public void user_open_url(String url) {
	   
		driver.get(url);
		
	}

	@When("^User enters email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_email_as_and_password_as(String email, String pwd)  {
		
		lp.setUserName(email);
		lp.setPassword(pwd);
	    
	}

	@When("^Click on Login$")
	public void click_on_Login() {
		
		lp.loginbutton();
	   
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String title)  {
		
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);}
		
		else {
			
			Assert.assertEquals(title,driver.getTitle());
		}
	    
	}

	@When("^user click on Logout link$")
	public void user_click_on_Logout_link() throws InterruptedException  {
		
		lp.logoutbutton();
		Thread.sleep(3000);   
		
	}

	@Then("^Close browser$")
	public void close_browser() {
		
		driver.quit();
	    
	}


	
	
	
}