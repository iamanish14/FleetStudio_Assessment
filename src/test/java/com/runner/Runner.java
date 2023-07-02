package com.runner;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Locators.Locators;
import com.baseclass.BaseClass;

public class Runner extends BaseClass {

	
	@BeforeSuite
	public void launch() {
		browserlaunch();
	}
	
	@Test
	public void getRegister() {
		launchUrl("https://tutorialsninja.com/demo/index.php?route=account/login");
		clickOnElement(Locators.getLoc().getNewcustmr_input());
	}
	@Test(dependsOnMethods = "getRegister")
	public void register() {
		implicityWait();
	//	System.out.println(getPageTitle());
		Assert.assertEquals(getPageTitle(), "Register Account");
		inputText(Locators.getLoc().getFirstname_input(), "fleet");
		inputText(Locators.getLoc().getLastname_input(), "studio");
		inputText(Locators.getLoc().getEmail_input(), "fleetstudio@23.com");
		inputText(Locators.getLoc().getPhone_input(), "987654321");
		inputText(Locators.getLoc().getPassword_input(), "qwerty");
		inputText(Locators.getLoc().getCnfrmpass_input(), "qwerty");
		clickOnElement(Locators.getLoc().getSubscribe_radio());
		clickOnElement(Locators.getLoc().getAgree_checkbox());
		clickOnElement(Locators.getLoc().getContinue_btn());
	}
	@Test(dependsOnMethods = "register")
	public void registerSuccess() {
		try {
			Assert.assertNotEquals(getPageTitle(),"Your Account Has Been Created!" , "");
			screenshot("error");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
