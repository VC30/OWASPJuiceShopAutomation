package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver){
		 super(driver);
	}
	
	
@FindBy(xpath="//a[normalize-space()='Not yet a customer?']")	
WebElement NotACustomerLink;

public void ClickNotACustomer() {
	NotACustomerLink.click();
}
	
@FindBy(xpath="//input[@id='email']")
WebElement txtEmail;

public void setEmail(String email) {
	txtEmail.sendKeys(email);
}

@FindBy(xpath="//input[@id='password']")
WebElement txtPassword;

public void setPassword(String password) {
	txtPassword.sendKeys(password);
}

@FindBy(xpath="//button[@id='loginButton']//span[@class='mat-button-wrapper']")	
WebElement btnLogin;

public void clickLoginbutton() {
	btnLogin.click();
}
	
	
	

}
