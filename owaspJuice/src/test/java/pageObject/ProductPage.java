package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage{
	public Actions action;
	public WebDriverWait wait;

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	
@FindBy(xpath="//span[normalize-space()='Your Basket']")
WebElement btnBasket;	
	
@FindBy(css=".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")
WebElement overlay;
	
@FindBy(css="mat-grid-tile:nth-child(1) > div > mat-card > div:nth-child(2) > button")	
WebElement btnAddAppleJuice;

@FindBy(css="mat-grid-tile:nth-child(3) > div > mat-card > div:nth-child(2) > button")	
WebElement btnAddBananJuice;

public void addAppleJuiceToCart() {
	/*action = new Actions(driver);
	overlay.click();
	action.pause(Duration.ofSeconds(6)).build().perform();
	wait.until(ExpectedConditions.elementToBeClickable(btnAddAppleJuice)).click();*/
	btnAddAppleJuice.click();
}

public void addBananaJuiceToCart() {
	//wait.until(ExpectedConditions.elementToBeClickable(btnAddBananJuice)).click();
	//action.pause(Duration.ofSeconds(4)).build().perform();
	//btnAddBananJuice.click();
	/*action = new Actions(driver);
	action.pause(Duration.ofSeconds(3))
    .click(btnAddBananJuice)
    .perform();*/
	
	btnAddBananJuice.click();	
}

public void clickBasket() {
	btnBasket.click();
}

	

}
