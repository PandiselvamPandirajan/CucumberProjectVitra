package org.stepdefinition;

import org.base.BaseClase;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VitraLogin extends BaseClase{
	
	@Given("To Launch the Chrome browser and hit the Vitra Url")
	public void to_Launch_the_Chrome_browser_and_hit_the_Vitra_Url() {
	    chromeBrowser();
		maxwindow();
		lanchURL("https://myprofile.vitra.com/auth/login" );
	}

	@When("To Enter Valid Email in Email Field")
	public void to_Enter_Valid_Email_in_Email_Field() {
	    
		LoginPojo l = new LoginPojo();
		WebElement txtemail = l.getTxtemail();
		fillTextBox(txtemail,"pandiselvam353@gmail.com");
	}

	@When("To Enter Invalid Password in Password Field")
	public void to_Enter_Invalid_Password_in_Password_Field() {
		LoginPojo l = new LoginPojo();
		WebElement txtpass = l.getTxtpass();
		fillTextBox(txtpass, "123456");
	}

	@When("To Click the login Button")
	public void to_Click_the_login_Button() {
		
		LoginPojo l = new LoginPojo();
		WebElement loginbutton = l.getLoginbutton();
		buttonclick(loginbutton);
	    
	}

	@Then("To Close the Chrome browser")
	public void to_Close_the_Chrome_browser() {
	    closeBrowser();
	}

}
