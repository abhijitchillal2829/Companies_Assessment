package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazeDemoPurchasePage {

	private WebDriver driver;

	@FindBy(id = "inputName")
	private WebElement inputName;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "state")
	private WebElement state;

	@FindBy(id = "zipCode")
	private WebElement zipCode;

	@FindBy(id = "creditCardNumber")
	private WebElement creditCardNumber;

	@FindBy(id = "nameOnCard")
	private WebElement nameOnCard;

	@FindBy(xpath = "//h1[contains(text(),\"Thank you for your purchase today!\")]")
	private WebElement purchaseConfirmation;

	public BlazeDemoPurchasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterName(String name) {
		inputName.sendKeys(name);
	}

	public void enterAddress(String addr) {
		address.sendKeys(addr);
	}

	public void enterCity(String cityName) {
		city.sendKeys(cityName);
	}
	
	public void enterState(String stateName) {
		state.sendKeys(stateName);	
	}
	
	public String enterZipCode(String zipCode) {
		return zipCode;
	}
	public WebElement enterCreditCardNumber(String creditCardNo) {
		return nameOnCard;
	}
	public WebElement enterNameOnCard(String cardHolderName) {
		return purchaseConfirmation;
	}
}
