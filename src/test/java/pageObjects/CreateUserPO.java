package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CreateUserPO {
	
	WebDriver driver;
	
	public CreateUserPO(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	
	
	 @FindBy(linkText="Register here") 					public WebElement RegisterLink; 
	 @FindBy(xpath="//input[@name='register']") 		public WebElement Reg_Submit_Button;
	 @FindBy(xpath="//input[@name='firstName']")		public WebElement FirstName;
     @FindBy(xpath="//input[@name='lastName']")			public WebElement LastName;
     @FindBy(xpath="//input[@name='phone']")			public WebElement PhoneNumber;
     @FindBy(id="userName") 							public WebElement EmailID;
     @FindBy(xpath="//input[@name='address1']")			public WebElement Address;
     @FindBy(xpath="//input[@name='city']")				public WebElement City;
     @FindBy(xpath="//input[@name='state']")			public WebElement State;
     @FindBy(xpath="//input[@name='postalCode']")		public WebElement PostalCode;
     @FindBy(xpath="//select[@name='country']")			public WebElement Country;
     @FindBy(xpath="//input[@name='email']")			public WebElement UserName;
     @FindBy(xpath="//input[@name='password']")			public WebElement Password;
     @FindBy(xpath="//input[@name='confirmPassword']")	public WebElement ConfirmPassword;
     
     
     /*** Click on Registration Link ***/
 	public void setRegisterLink() {
 		
 		WebDriverWait wait=new WebDriverWait(driver, 15);
 		wait.until(ExpectedConditions.elementToBeClickable(RegisterLink));
 		RegisterLink.click();
 		wait.until(ExpectedConditions.visibilityOf(FirstName));
 		System.out.println("[setRegisterLink] Registration page Opened");
 	}
     
     
     
     public void setInputField(WebElement elIputField, String strInputData) {
    	 System.out.println("[setInputField] "+elIputField+" strInputData="+strInputData);
    	 WebDriverWait inputWait=new WebDriverWait(driver, 10);
    	 inputWait.until(ExpectedConditions.visibilityOf(elIputField));
    	 elIputField.clear();
    	 elIputField.sendKeys(strInputData);
    	 inputWait.until(ExpectedConditions.attributeToBe(elIputField, "value", strInputData));
    	 System.out.println("[setInputField] Commpleted..");
     }
	
     public void handleDropDown(WebElement Element, String strValue) {
 		
 		Select dd=new Select(Element);
 		dd.selectByVisibleText(strValue.toUpperCase());
 		System.out.println("Expected:"+strValue.toUpperCase().trim()+" Actual:"+dd.getFirstSelectedOption().getText().trim());
 		Assert.assertEquals(strValue.toUpperCase().trim(),dd.getFirstSelectedOption().getText().trim());
 		System.out.println("[handleDropDown] Completed..");
 	}
	
	
}
