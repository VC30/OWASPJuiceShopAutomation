package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BasePage{
	public Actions action;

	public AddressPage(WebDriver driver) {
		super(driver);
	}
	
	
@FindBy(xpath="//span[normalize-space()='Add New Address']")
WebElement btnAddNewAddress;

public void clickAddAddress() {
	btnAddNewAddress.click();
}

//@FindBy(css=".mat-form-field:nth-child(1) input")
@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-address-create[1]/div[1]/mat-card[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
WebElement txtCountry;

public void addCountry(String Country) {
	//txtCountry.sendKeys(Country);
	action = new Actions(driver);
	action.pause(Duration.ofSeconds(1))
    .click(txtCountry)
    .sendKeys(Country)
    .perform();
}

@FindBy(css=".mat-form-field:nth-child(2) input")
WebElement txtName;

public void addName(String Name) {
	txtName.sendKeys(Name);
}

@FindBy(css=".mat-form-field:nth-child(3) input")       
WebElement txtPhoneNumber;      

public void addPhoneNumber(String number) {
	txtPhoneNumber.sendKeys(number);
}

@FindBy(css=".mat-form-field:nth-child(4) input")
WebElement txtZipcode;      

public void addZipCode(String zipcode) {
	txtZipcode.sendKeys(zipcode);
}

@FindBy(xpath="//textarea[@id='address']")  
WebElement txtAddress;   
//mat-card > div.addressCont > div:nth-child(3)
public void addAddress(String address) {
	txtAddress.sendKeys(address);
}

@FindBy(css=".mat-form-field:nth-child(6) input")  
WebElement txtCity;   

public void addCity(String city) {
	txtCity.sendKeys(city);
}

@FindBy(css=".mat-form-field:nth-child(7) input")  
WebElement txtState;   

public void addState(String state) {
	txtState.sendKeys(state);
}

@FindBy(xpath="//button[@id='submitButton']//span[@class='mat-button-wrapper']")  
WebElement btnSubmit;   

public void clickSubmit() {
	action = new Actions(driver);
	action.pause(Duration.ofSeconds(3))
    .click(btnSubmit)
    .perform();
}

//@FindBy(css="mat-cell > mat-radio-button")  
@FindBy(css=".mat-radio-outer-circle")
//@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[1]")
WebElement rbtnSelectAddress;   

public void selectAddress() {
	action = new Actions(driver);
	action.pause(Duration.ofSeconds(4))
    .click(rbtnSelectAddress)
    .perform();
}

@FindBy(xpath="//span[normalize-space()='Continue']")  
WebElement btnContinue1;   

public void clickContinue1() {
	btnContinue1.click();
}


@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-delivery-method[1]/mat-card[1]/div[3]/mat-table[1]/mat-row[1]/mat-cell[1]/mat-radio-button[1]/label[1]/span[1]/span[1]")
WebElement rbtnSelectDelSpeed;   

public void selectDelSpeed() {
	action = new Actions(driver);
	action.pause(Duration.ofSeconds(3))
    .click(rbtnSelectDelSpeed)
    .perform();
}

@FindBy(xpath="//span[normalize-space()='Continue']")
WebElement btnContinue2;   

public void clickContinue2() {
	btnContinue2.click();
}






}
