package testcases;

import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class VerifyHomePage extends BaseHooks {
	
	@Test
	public void runVerifyHomePage() throws InterruptedException {
		
	//	LoginPage lp = new LoginPage();
		
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyHomePage();
		

	}

}
