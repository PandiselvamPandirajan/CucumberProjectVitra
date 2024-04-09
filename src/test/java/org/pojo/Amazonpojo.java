package org.pojo;

import org.base.BaseClase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonpojo extends BaseClase {

	public Amazonpojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@type='email']")
	private WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPass;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signInButton;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}
}
