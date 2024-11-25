package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SummaryPage extends BasePage{
	public Actions action;
	public SummaryPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="checkoutButton")	
	WebElement btnCheckout;


public void clickCheckout () {
	action = new Actions(driver);
	action.pause(Duration.ofSeconds(2))
    .click (btnCheckout)
    .build ()
    .perform ();
}


}
