package testCases;

import org.testng.annotations.Test;

import pageObject.AddressPage;
import pageObject.Homepage;
import pageObject.LoginPage;
import pageObject.ProductPage;
import pageObject.SummaryPage;
import testBase.BaseClass;

public class TC005_AddPaymentAddressTest extends BaseClass {
	
	@Test
	public void verify_paymentAddress() {
		//Home Page Actions
		Homepage hp = new Homepage(driver);
		
		hp.DismissWelcomePop();
		hp.DismissCookiesPop();
		hp.ClickMyAccount();
		hp.ClickLogin();
		
		//login page actions
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmail("somebody2@mail.com");
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
		
		//Address page Actions
		AddressPage ap = new AddressPage(driver);
		ap.clickAddAddress();
		ap.addCountry("Nigeria");
		ap.addName("Ola");
		ap.addPhoneNumber("08186488080");
		ap.addZipCode("101238");
		ap.addAddress("somewhere around the world");
		ap.addCity("city boy");
		ap.addState("Lagos");
		ap.clickSubmit();
		
		ap.selectAddress();
		ap.clickContinue1();
		ap.selectDelSpeed();
		ap.clickContinue2();
	}

}
