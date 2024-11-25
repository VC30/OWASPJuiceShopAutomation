package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage{
	public Homepage(WebDriver driver){
		 super(driver);
	}

@FindBy(xpath="//span[normalize-space()='Dismiss']") 
WebElement WelcomePopDimiss;

@FindBy(xpath="//a[@aria-label='dismiss cookie message']") 
WebElement CookiesPopDismiss;

@FindBy(xpath="//button[@id='navbarAccount']")
WebElement btnAccount;

@FindBy(xpath="//button[@id='navbarLoginButton']")
WebElement btnLogin;

public void DismissWelcomePop(){
	WelcomePopDimiss.click();
}

public void DismissCookiesPop() {
	CookiesPopDismiss.click();
}

public void ClickMyAccount() {
	btnAccount.click();
}

public void ClickLogin() {
	btnLogin.click();
}
	
	
	
	
	
	
	
	
	
	
}
