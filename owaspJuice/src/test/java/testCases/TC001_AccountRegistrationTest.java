package testCases;

import org.testng.annotations.Test;

import pageObject.Homepage;
import pageObject.LoginPage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{
	
	@Test
	public void verify_account_registration() {
		
		//Home Page Actions
		Homepage hp = new Homepage(driver);
		
		hp.DismissWelcomePop();
		hp.DismissCookiesPop();
		hp.ClickMyAccount();
		hp.ClickLogin();
		
		//Login Page Actions
		LoginPage lp = new LoginPage(driver);
		lp.ClickNotACustomer();
		
		
		//Registration Page Actions
		RegistrationPage rp = new RegistrationPage(driver);
		rp.setEmail("somebody2@mail.com");
		rp.setPassword("Abc!123456");
		rp.setConPassword("Abc!123456");
		rp.securityQueDrpDwn("Mother's maiden name?");
		rp.setSecurityAns("Mother");
		rp.clickRegister();
	}

}
