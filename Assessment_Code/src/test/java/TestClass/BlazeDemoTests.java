package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageModel.BlazeDemoHomePage;
import PageModel.BlazeDemoPurchasePage;

public class BlazeDemoTests {

	 private WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        driver = new ChromeDriver();
	    }

	    @DataProvider(name = "cities")
	    public Object[][] citiesData() {
	        return new Object[][]{
	            {"Mexico City", "London"},
	        };
	    }

	    @Test(dataProvider = "cities")
	    public void purchaseTicket(String fromCity, String toCity) {
	        BlazeDemoHomePage homePage = new BlazeDemoHomePage(driver);
	        BlazeDemoPurchasePage purchasePage = new BlazeDemoPurchasePage(driver);

	        homePage.selectDepartureCity(fromCity);
	        homePage.selectDestinationCity(toCity);
	        homePage.clickSubmit();

	      
	        purchasePage.enterName("Abhijit");
	        purchasePage.enterAddress("Mumbai");
	        purchasePage.enterCity("Mumbai");
	        purchasePage.enterState("Maharashtra");
	        purchasePage.enterZipCode("12345");
	        purchasePage.enterCreditCardNumber("YourCreditCardNumberHere");
	        purchasePage.enterNameOnCard("Abhijit Chillal");


	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }

}
