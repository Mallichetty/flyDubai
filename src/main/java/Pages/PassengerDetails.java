package Pages;

import Page_Object_Factory.PassengerDetailsPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class PassengerDetails
{

	WebDriver driver;

	public PassengerDetails(WebDriver driver)
	{
		this.driver= driver;
	}
	PassengerDetailsPage passengerDetailsPage = new PassengerDetailsPage(driver);
	public static Logger log = LogManager.getLogger(PassengerDetails.class.getName());

	public void enterPassengerDetails()
	{
		passengerDetailsPage.enterfirstName("Test");
		passengerDetailsPage.enterlastName("Name");
		passengerDetailsPage.enterEmailAddress("a@a.co");
		passengerDetailsPage.selectGender();
		passengerDetailsPage.selectCountryCode();
		passengerDetailsPage.enterPassportNo("R1234566");
		passengerDetailsPage.selectIssCountry();
		passengerDetailsPage.selectIssueDay();
		passengerDetailsPage.selectIssueMonth();
		passengerDetailsPage.selectIssueYear();
		passengerDetailsPage.selectExpiryDay();
		passengerDetailsPage.selectExpiryMonth();
		passengerDetailsPage.selectExpiryYear();
		passengerDetailsPage.selectNationality();
		passengerDetailsPage.selectDOBDay();
		passengerDetailsPage.selectDOBMonth();
		passengerDetailsPage.selectDOBYear();
	}
}
