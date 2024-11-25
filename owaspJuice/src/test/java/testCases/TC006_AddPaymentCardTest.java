package testCases;

import org.testng.annotations.Test;

import pageObject.AddressPage;
import pageObject.Homepage;
import pageObject.LoginPage;
import pageObject.PaymentOptionsPage;
import pageObject.ProductPage;
import pageObject.SummaryPage;
import testBase.BaseClass;

public class TC006_AddPaymentCardTest extends BaseClass{
	
	@Test
	public void verify_paymentCardAdded() {
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
		
		//Payment Options page Actions
		PaymentOptionsPage po = new PaymentOptionsPage(driver);
		po.clickAddNewCard();
		po.addCardName("Ade Alaba");
		po.addCardNumber("1234566123456612");
		po.addExpiryMonth("4");
		po.addExpiryYear("2085");
		po.clickSubmit();
		po.clickContinue();
	}

}
