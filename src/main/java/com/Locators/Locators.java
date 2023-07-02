package com.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class Locators extends BaseClass {

	private Locators() {
		PageFactory.initElements(driver, this);
	}
	
	private static Locators loc;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement newcustmr_input;
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstname_input;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastname_input;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email_input;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement phone_input;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password_input;
	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement cnfrmpass_input;
	
	@FindBy(xpath = "//label[text() = 'Yes']")
	private WebElement subscribe_radio;
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement agree_checkbox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continue_btn;
	
		
	public static Locators getLoc() {
		if (loc == null) {
			loc = new Locators();
		}
		return loc;
	}

	public WebElement getNewcustmr_input() {
		return newcustmr_input;
	}

	public WebElement getFirstname_input() {
		return firstname_input;
	}

	public WebElement getLastname_input() {
		return lastname_input;
	}

	public WebElement getEmail_input() {
		return email_input;
	}

	public WebElement getPhone_input() {
		return phone_input;
	}

	public WebElement getPassword_input() {
		return password_input;
	}

	public WebElement getCnfrmpass_input() {
		return cnfrmpass_input;
	}

	public WebElement getSubscribe_radio() {
		return subscribe_radio;
	}

	public WebElement getAgree_checkbox() {
		return agree_checkbox;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	}
	
	
	
}
