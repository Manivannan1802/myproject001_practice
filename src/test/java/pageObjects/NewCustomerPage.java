package pageObjects;
 
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class NewCustomerPage {
public WebDriver ldriver;
	public NewCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);;
	}
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement customertab;
    @FindBy(name="name")
    WebElement Customername;
    @FindBy(xpath="(//input[@type='radio'])[1]")
    WebElement GenderMale;
    @FindBy(xpath="(//input[@type='radio'])[2]")
    WebElement GenderFemale;
    @FindBy(id="dob")
    WebElement DateOfBirth;
    @FindBy (name="addr")
    WebElement Address;
    @FindBy (name="city")
    WebElement City;
    @FindBy (name ="state")
    WebElement state;
    @FindBy(name="pinno")
    WebElement Pin;
    @FindBy (name="telephoneno")
    WebElement MobileNo;
    @FindBy (name = "emailid")
    WebElement EmailID;
    @FindBy(name ="password")
    WebElement Password;
    @FindBy(name="sub")
    WebElement Submit;
    @FindBy(xpath="//p[@class='heading3']")
    WebElement Validation;
    @FindBy(xpath="//table//td//tr[4]//td[2]")
    WebElement CustomerID;
    
    public void ClickOncustomertab()
    {
    	customertab.click();
    }
    public void SetCustomerName(String  Name)
    {
    	Customername.sendKeys(Name);
    }
    public void SetGender(String gender)
    {
    	if(gender.equalsIgnoreCase("Male"))
    			GenderMale.click();
    	else
    	{
    		GenderFemale.click();
    	}			
    }
    public void SetDOB(String dob)
    {
    	DateOfBirth.sendKeys(dob);
    }
    public void AddAddress(String address)
    {
    	Address.click();
    	Address.sendKeys(address);
    }
    public void EnterCity(String city)
    {
    	City.sendKeys(city);
    }    
    public void EnterState(String State)
    {
    	state.sendKeys(State);
    }
    public void SetPIN(String PIN)
    {
    	Pin.sendKeys(PIN);
    }
    public void AddMobileNumber(String Number)
    {
    	MobileNo.sendKeys(Number);
    }
    public void AddEmailID(String emailID)
    {
    	EmailID.click();
    	EmailID.sendKeys(emailID);
    }
    public void SetPassword(String password)
    {
    	Password.sendKeys(password);
    }
    public void ClickSubmitbutton()
    {
    	Submit.click();
    }
  public String TextValidation()
  {
	  String validation1=Validation.getText();
	  return validation1;
  }
 public int customerIDVerification()
 {
	 String CID=CustomerID.getText();

	 int CIDNo =Integer.parseInt(CID);
	 return CIDNo;
 }

}