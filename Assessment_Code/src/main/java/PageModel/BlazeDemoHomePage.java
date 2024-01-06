package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazeDemoHomePage {

	private WebDriver driver;

	@FindBy(xpath = "//select[@name=\"fromPort\"]")
	private WebElement from;

	@FindBy(xpath = "//select[@name=\"toPort\"]")
	private WebElement to;

	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement submitButton;

	public BlazeDemoHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement selectDepartureCity(String city) {
		return from;
	}

	public WebElement selectDestinationCity(String city) {
		return to;
	}

	public void clickSubmit() {
		submitButton.click();
	}

}
