package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pageObjects.BankingLoginPage;
import pageObjects.NewCustomerPage;

public class BaseClass {
	
	
	
	
	static Logger logger = Logger.getLogger(BaseClass.class);
	public WebDriver driver;
	public BankingLoginPage blp;
	public Alert alert;
	public NewCustomerPage nc;
		

	public void takingscreenshot(String ScreenshotName) throws IOException
	{
		// driver = new ChromeDriver();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Sourcefile =ts.getScreenshotAs(OutputType.FILE);
		File Destinationfile =new File("C:\\Users\\megal\\git\\myproject001_practice\\Screenshot\\"+ScreenshotName+".png");
		FileUtils.copyFile(Sourcefile, Destinationfile);
		
		
	}
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addExtensions(new File("./Extensions/adblock.crx"));
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		blp=new BankingLoginPage(driver);
		nc=new NewCustomerPage(driver);
	}
}