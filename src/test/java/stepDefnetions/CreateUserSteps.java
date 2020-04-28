package stepDefnetions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.CreateUserPO;
import utilities.Generic;

public class CreateUserSteps {

	public WebDriver driver;
	public CreateUserPO objCU;

	@Given("Launch Chrome Browser")
	public void launch_Chrome_Browser() {

		System.out.println("[launch_Chrome_Browser] ...");
		objCU = new CreateUserPO(driver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("[launch_Chrome_Browser] ...Completed");
	}

	@When("Enter url {string}")
	public void enter_url(String strFireUrl) {

		System.out.println("[enter_url] " + strFireUrl);
		driver.get(strFireUrl);
	}

	@Then("Click on Register user link")
	public void click_on_Register_user_link() {

		objCU = new CreateUserPO(driver);
		objCU.setRegisterLink();
		System.out.println("[click_on_Register_user_link] Clicked on registratio LInk");
	}

	@Then("Enter FirstName as {string}")
	public void enter_FirstName_as(String strFirstName) {

		objCU = new CreateUserPO(driver);
		objCU.setInputField(objCU.FirstName, strFirstName);
		System.out.println("[enter_FirstName_as] Completed.");
	}

	@Then("Enter LastName as {string}")
	public void enter_LastName_as(String strLastName) {

		objCU = new CreateUserPO(driver);
		objCU.setInputField(objCU.LastName, strLastName);
		System.out.println("[enter_LastName_as] Completed.");
	}

	@Then("Enter Phone Number as {string}")
	public void enter_Phone_Number_as(String strPhoneNumber) {

		objCU = new CreateUserPO(driver);
		objCU.setInputField(objCU.PhoneNumber, strPhoneNumber);
		System.out.println("[enter_Phone_Number_as] Completed.");
	}

	@Then("Enter EmailID as {string}")
	public void enter_EmailID_as(String strEmailId) {

		objCU = new CreateUserPO(driver);
		objCU.setInputField(objCU.EmailID, strEmailId);
		System.out.println("[enter_EmailID_as] Completed.");
	}

	@Then("Enter Adress as {string}")
	public void enter_Adress_as(String strAddress) {

		objCU = new CreateUserPO(driver);
		objCU.setInputField(objCU.Address, strAddress);
		System.out.println("[enter_Adress_as] Completed.");
	}

	@Then("Enter City as {string}")
	public void enter_City_as(String strCity) {

		objCU = new CreateUserPO(driver);
		objCU.setInputField(objCU.City, strCity);
		System.out.println("[enter_City_as] Completed.");
	}

	@Then("Enter State\\/Province as {string}")
	public void enter_State_Province_as(String strState) {

		objCU = new CreateUserPO(driver);
		objCU.setInputField(objCU.State, strState);
		System.out.println("[enter_State_Province_as] Completed.");
	}

	@Then("Enter Postal Code as {string}")
	public void enter_Postal_Code_as(String strPostalCode) {

		objCU = new CreateUserPO(driver);
		objCU.setInputField(objCU.PostalCode, strPostalCode);
		System.out.println("[enter_Postal_Code_as] Completed.");
	}

	@Then("Enter Country as {string}")
	public void enter_Country_as(String strCountry) {

		objCU = new CreateUserPO(driver);
		Generic.handleDropDown(objCU.Country, strCountry);
//		objCU.handleDropDown(objCU.Country, strCountry);
		System.out.println("[enter_Country_as] Completed.");
	}

	@Then("Enter User Name as {string}")
	public void enter_User_Name_as(String strUserName) {

		objCU = new CreateUserPO(driver);
		objCU.setInputField(objCU.UserName, strUserName);
		System.out.println("[enter_Country_as] Completed.");
	}

	@Then("Enter Password  {string} and confirm password {string}")
	public void enter_Password_and_confirm_password(String strPassword, String strConfirmPassword) {

		objCU = new CreateUserPO(driver);
		objCU.setInputField(objCU.Password, strPassword);
		objCU.setInputField(objCU.ConfirmPassword, strConfirmPassword);
		System.out.println("[enter_Password_and_confirm_password] Completed.");
	}

	@Then("Close Browser")
	public void closeBrowsser() {
		driver.quit();
	}

}
