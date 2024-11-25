package testCases;

import org.testng.annotations.Test;

import pageObject.AddressPage;
import pageObject.Homepage;
import pageObject.LoginPage;
import pageObject.ProductPage;
import pageObject.SummaryPage;
import testBase.BaseClass;

public class TC004_CheckOutTest extends BaseClass{
	
	@Test
	public void verify_checkOut() {	
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
		
		
		//Product Page Actions
		ProductPage pp = new ProductPage(driver);
		pp.addAppleJuiceToCart();
		pp.addBananaJuiceToCart();
		pp.clickBasket();
		
		
		//summary page Actions
		SummaryPage sp = new SummaryPage(driver);
		sp.clickCheckout();
	}

}
