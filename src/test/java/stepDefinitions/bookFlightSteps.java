package stepDefinitions;

import Page_Object_Factory.*;
import Pages.PassengerDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class bookFlightSteps {

	public static Logger log = LogManager.getLogger(bookFlightSteps.class.getName());
	WebDriver driver;
	FlyDubaiDashBoardPage dashboardPage = new FlyDubaiDashBoardPage(driver);
	ResultsPage resultsPage = new ResultsPage(driver);
	ExtrasPage extrasPage = new ExtrasPage(driver);
	PassengerDetailsPage passengerDetailsPage = new PassengerDetailsPage(driver);
	PassengerDetails passengerDetails = new PassengerDetails(driver);
	ReviewYourBookingDetailsPage reviewYourBookingDetailsPage = new ReviewYourBookingDetailsPage(driver);

	@When("User enter the route from {string} to {string} on April for {string} passengers")
	public void userEnterTheRouteFromToOnAprilForPassengers(String from, String to, String passengers) {
		dashboardPage.selectFrom(from);
		dashboardPage.selectTo(to);
		dashboardPage.clickOneWayCheckBox();
		dashboardPage.selectDate();
	}

	@Then("^User click on search button$")
	public void Userclickonsearchbutton() {
		dashboardPage.clickSubmitButton();
		log.info("Search Button has been clicked");
	}

	@Then("^verify if user lands on the flights result page$")
	public void verifyifuserlandsontheflightsresultpage() {
		Assert.assertTrue("Results Page is not Displayed",resultsPage.verifyPageTitle());
	}

	@And("^user click on the flight tab and select one fare brand$")
	public void userclickontheflighttabandselectonefarebrand() {
		resultsPage.clickSelectFlight();
		resultsPage.clickSelectType();
	}

	@Then("^user select the onward and return flights$")
	public void userselecttheonwardandreturnflights() {
		resultsPage.clickSelectFareButton();
	}

	@Then("^user select inbound flights and verify if system redirects to extras page$")
	public void userselectinboundflightsandverifyifsystemredirectstoextraspage() {
		Assert.assertTrue("Extras Page is not displayed",extrasPage.verifyPageTitle());
	}

	@And("^user select 10kg additional baggage$")
	public void userselect10kgadditionalbaggage() {
		extrasPage.clickBaggageOption();
	}

	@And("^user clicks on continue to passenger details hyperlink$")
	public void userclicksoncontinuetopassengerdetailshyperlink() {
		extrasPage.clickPassengerDetailsBtn();
	}

	@And("^verify if user landed on passenger detail page$")
	public void verifyifuserlandedonpassengerdetailpage() {
		Assert.assertTrue(passengerDetailsPage.verifyPageTitle());
	}

	@Then("^user now enter the passenger information$")
	public void usernowenterthepassengerinformation() {
		passengerDetails.enterPassengerDetails();
	}

	@And("^user click on review booking button$")
	public void userclicksonreviewbookingbuttonk() {
		passengerDetailsPage.clickReviewBooking();
		log.info("Review Booking button is clicked");
	}

	@Then("^verify if user landed on the review your bookings page$")
	public void verifyifuserlandedonthereviewyourbookingspage()
	{
		reviewYourBookingDetailsPage.verifyPageTitle();
	}

	@And("^user validates the fare and tax component displayed in the first page is same$")
	public void uservalidatesthefareandtaxcomponentdisplayedinthefirstpageissame() {

	}
}
