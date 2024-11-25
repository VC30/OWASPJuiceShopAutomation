package pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PaymentOptionsPage extends BasePage{
	public Actions action;

	public PaymentOptionsPage(WebDriver driver) {
		super(driver);
	}
/*
 * 	

 */
	
@FindBy(css="mat-expansion-panel-header#mat-expansion-panel-header-3 > span.mat-content")
WebElement drpdwnNewCard;

public void clickAddNewCard() {
	action = new Actions(driver);
	action.pause(Duration.ofSeconds(1))
    .click(drpdwnNewCard)
    .perform();
	//drpdwnNewCard.click();
}

@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-payment[1]/mat-card[1]/div[1]/app-payment-method[1]/div[1]/div[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
WebElement txtCardName;
public void addCardName(String name) {
	action = new Actions(driver);
	action.pause(Duration.ofSeconds(3))
    .click(txtCardName)
    .sendKeys(name)
    .perform();
	
}

@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-payment[1]/mat-card[1]/div[1]/app-payment-method[1]/div[1]/div[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[3]/input[1]")
WebElement txtCardNumber;
public void addCardNumber(String number) {
	txtCardName.sendKeys(number);
}

@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-payment[1]/mat-card[1]/div[1]/app-payment-method[1]/div[1]/div[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/mat-form-field[3]/div[1]/div[1]/div[3]/select[1]")
WebElement drpdwnExpiryMonth;
public void addExpiryMonth(String month) {
	Select drpMonth = new Select(drpdwnExpiryMonth);  //select method is only applicable to select type of dropdown
	drpMonth.selectByVisibleText(month);
}

@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-payment[1]/mat-card[1]/div[1]/app-payment-method[1]/div[1]/div[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/mat-form-field[4]/div[1]/div[1]/div[3]/select[1]")
WebElement drpdwnExpiryYear;
public void addExpiryYear(String year) {
	Select drpYear = new Select(drpdwnExpiryYear);  //select method is only applicable to select type of dropdown
	drpYear.selectByVisibleText(year);
}

@FindBy(id="submitButton")
WebElement btnSubmit;
public void clickSubmit() {
	btnSubmit.click();
}

@FindBy(xpath="//span[normalize-space()='Continue']")
WebElement btnContinue;
public void clickContinue() {
	action = new Actions(driver);
	action.pause(Duration.ofSeconds(2))
    .click(btnContinue)
    .perform();
}

}
