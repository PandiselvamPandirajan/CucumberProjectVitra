package org.pojo;

import org.base.BaseClase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;


public class LoginPojo extends BaseClase {

	public LoginPojo() {
		
		PageFactory.initElements(driver,this);
	}
		@FindBy(name="USERNAME")
		private WebElement txtemail;
		
		@FindBy(name="PASSWORD")
		private WebElement txtpass;
		
		@FindBy(xpath="//button[@role='button']")
		private WebElement deny;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement loginbutton;

		public WebElement getTxtemail() {
			return txtemail;
		}

		public WebElement getTxtpass() {
			return txtpass;
		}
		
		public WebElement getDeny() {
			return deny;
		}
		public WebElement getLoginbutton() {
			return loginbutton;
		}
	}
