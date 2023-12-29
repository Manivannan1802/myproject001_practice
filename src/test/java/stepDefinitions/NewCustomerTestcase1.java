package stepDefinitions;
 
import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import pageObjects.BankingLoginPage;
import pageObjects.NewCustomerPage;
 
 
public class NewCustomerTestcase1 extends BaseClass {
 
		

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
	openBrowser();
	
	}
 
	@When("user open url  {string}")
	public void user_open_url(String url) {

	   driver.get(url);
	   logger.info("Launch the URL");
	}
 
	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
		blp.setUserName(username);
		blp.setPassword(password);
	}
 
	@When("Click on Login")
	public void click_on_login() {
		blp.loginButton();
	}
 
	@Then("page title should be {string}")
	public void page_title_should_be(String title) {

		if(alert!=null) {
			System.out.println(alert.getText());
			System.out.println("Invalid login");
			alert.accept();
			Assert.assertTrue(false);
		}
		else if(title.equals(driver.getTitle())) {
			System.out.println(driver.getTitle());
			Assert.assertTrue(true);
		}
 
		
		else {
			Assert.assertTrue(false);
			System.out.println("Please check login page");
		}
	}
 
	@When("user click on Logout link")
	public void user_click_on_logout_link() throws InterruptedException {
		blp.logoutButton();
		Thread.sleep(5000);
	}

	 @Then("Alert should popup {string}") public void alert_should_popup(String
	  alertText) {
	  Alert alert=driver.switchTo().alert();
	  if(alertText.equals(alert.getText())) {
	  alert.accept();
	  System.out.println("alert closed");
	  }

	  else { System.out.println(alert.getText());
	  System.out.println("Please check alert message"); }
	 }

	@Then("Close browser")
	public void close_browser() {
		//driver.close();
	}

	//####################################################################################
	@Given("Navigate to the new customer page")
	public void navigate_to_the_new_customer_page() throws InterruptedException {
		nc.ClickOncustomertab(); 		
	}
	@When("User enter {string} as customer name")
	public void user_enter_as_customer_name(String name) {
		nc.SetCustomerName(name);
		System.out.println("Username Added");
	}
	@When("User enter {string} as Gender")
	public void user_enter_as_gender(String GenderClick) {
	    nc.SetGender(GenderClick);
	    System.out.println("Gender radio button is clicked");
	}
	@When("User enter {string} as DOB")
	public void user_enter_as_dob(String DOB) {
	nc.SetDOB(DOB);
	System.out.println("DateOfBirthisSelected");
	}
	@When("User enter {string} as address field")
	public void user_enter_as_address_field(String Address) {
	   nc.AddAddress(Address);
	   System.out.println("Address is entered");
	}
	@When("User enter {string} as city field")
	public void user_enter_as_city_field(String city) {
		nc.EnterCity(city);
	    System.out.println("City is entered");
	}
	@When("User enter {string} as state field")
	public void user_enter_as_state_field(String state) {
		nc.EnterState(state);
		System.out.println("State is Entered");
	}
	@When("User enter {string} as Pin field")
	public void user_enter_as_pin_field(String PIN) {
	nc.SetPIN(PIN);
	System.out.println("PIN is entered");
	}
	@When("User enter {string} as mobile number")
	public void user_enter_as_mobile_number(String MobileNumber) {
		nc.AddMobileNumber(MobileNumber);
		System.out.println("Mobile no is entered");
	}
	@When("User enter {string} as email id")
	public void user_enter_as_email_id(String EmailID) {
		nc.AddEmailID(EmailID);
		System.out.println("Email id is entered");
	}
	@When("User enter {string} as password field")
	public void user_enter_as_password_field(String Password) {
		nc.SetPassword(Password);
		System.out.println("Valid password is entered");
	}
	@When("User click on submit button to add the customer")
	public void user_click_on_submit_button_to_add_the_customer() {
		nc.ClickSubmitbutton();
		System.out.println("Button is Clicked");
	}

@Then("Page should be contain {string}")
public void page_should_be_contain(String Message) throws IOException, InterruptedException {
		
		//System.out.println(nc.emailIDExist());
	Thread.sleep(4000);
	
	 if (Message.equals(nc.TextValidation()))
			 {
		     nc.customerIDVerification();
		     System.out.println(nc.customerIDVerification());
		     takingscreenshot("CustomerID");
			 }
	 
	 else if(alert!=null)
	 {
		
	
			  
			  Alert alert = driver.switchTo().alert();

			  takingscreenshot("EmailID");
			  
			  WebDriverWait wait = new WebDriverWait(driver,10);
		      wait.until(ExpectedConditions.alertIsPresent());
		      
			  alert.accept();
		
	 }
	 else
	 {
		 logger.error("Customer is not created properly");
	     takingscreenshot("NotCreated");

	 }

    
	}
}