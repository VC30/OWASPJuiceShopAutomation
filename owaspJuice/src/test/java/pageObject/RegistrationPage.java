package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BasePage {
	
	public Actions action;
	public WebDriverWait wait;
	
	public RegistrationPage(WebDriver driver){
		 super(driver);
	}
	

@FindBy(xpath="//input[@id='emailControl']")
WebElement txtEmail;

@FindBy(xpath="//input[@id='passwordControl']")
WebElement txtPassword;

@FindBy(xpath="//input[@id='repeatPasswordControl']")       
WebElement txtConPassword;      

@FindBy(name="securityQuestion")
WebElement drpdwnArrow;                                               

@FindBy(xpath="//input[@id='securityAnswerControl']")  
WebElement txtSecurityAns;                             

@FindBy(xpath="//button[@id='registerButton']//span[@class='mat-button-wrapper']")	
WebElement btnRegister;
	
public void setEmail(String email) {
	txtEmail.sendKeys(email);
}

public void setPassword(String password) {
	txtPassword.sendKeys(password);
}

public void setConPassword(String conpassword) {
	txtConPassword.sendKeys(conpassword);
}
	
/*public void clickDropdown() {
	drpdwnArrow.click();
}	

*/

public void securityQueDrpDwn(String securityQuestion) {
	action = new Actions(driver);
	
	action.click(drpdwnArrow).perform();
	
	 // Use WebDriverWait to ensure the desired option is present and visible
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement selectOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
    		By.xpath("//mat-option/span[contains(text(),"+"\""+securityQuestion+"\")] ")
    ));
    // Click the desired option
    action.click(selectOption).perform();
}

public void setSecurityAns(String MotherName) {
	txtSecurityAns.sendKeys(MotherName);
}

public void clickRegister() {
	action = new Actions(driver);
	action.pause(Duration.ofSeconds(3))
    .click(btnRegister)
    .perform();
	//btnRegister.click();
}


}
