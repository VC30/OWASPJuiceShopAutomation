package testCases;

import org.testng.annotations.Test;

import pageObject.Homepage;
import pageObject.LoginPage;
import testBase.BaseClass;

public class TC002_LogInTest extends BaseClass{
	
	@Test
	public void verify_login() {
		
		//Home Page Actions
		Homepage hp = new Homepage(driver);
		
		hp.DismissWelcomePop();
		hp.DismissCookiesPop();
		hp.ClickMyAccount();
		hp.ClickLogin();
		
		//login page actions
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmail("somebody@mail.com");
		lp.setPassword("Abc!123456");
		lp.clickLoginbutton();
	}

}
