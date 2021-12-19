package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseHooks;
import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;

public class CreateLead extends BaseHooks{
	@Test
	public void runCreateLead() throws InterruptedException {
		
		System.out.println(driver);//2d2fecb52eeed92786b4d82ee121d0d4
		
		LoginPage lp = new LoginPage(driver); //enterUsername() is available in LoginPage
		
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickCreateLeadButton()
		.verifyFirstName();
		

	}

}
