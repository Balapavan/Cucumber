package stepDefnetions;

import io.cucumber.java.en.*;

public class LoginSteps {
	
	
	
	@Given("open browser")
	public void open_browser() {
	  
		System.out.println("Given..............open browser....");
	   
	}

	@When("Pass URL")
	public void pass_URL() {
	   
		System.out.println("@When....Pass URL..............");
	}

	@Then("Provide username and Password")
	public void provide_username_and_Password() {
		
		System.out.println("@When........Provide username and Password..........");
	   
	}

	@Then("Click on Login Button")
	public void click_on_Login_Button() {
	  
		System.out.println("@When........Click on Login Button..........");
	}

	@Then("Hope page displayed")
	public void hope_page_displayed() {
	  
		System.out.println("@@Then....Hope page displayed..............");
	}

	@Then("Close Chrome Browser")
	public void close_Browser() {
	   
		System.out.println("@@Then......Close Browser............");
	}

}
