package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage {
	
	
	public WebDriver ldriver;
	
	public SearchCustomerPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
		}
	

}
