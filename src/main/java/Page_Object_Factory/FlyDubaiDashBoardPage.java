package Page_Object_Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import resources.Base;

public class FlyDubaiDashBoardPage extends Base {

	WebDriver driver;

	public FlyDubaiDashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	By from = By.xpath("//div[contains(@class,'airportPickerFrom')]//label[@for='airport-origin'][1]/input");
	By to = By.xpath("//div[contains(@class,'airportPickerTo')]//label[@for='airport-destination'][1]/input");
	By date = By.xpath("//*[@id='dateRangeFrom']");
	By passengerDropDown = By
			.xpath("//*[@class='travellerDatadropdown bookingTo-wrapper drop-arrow-style']/div[1]/span[2]");
	By submitButton = By.xpath("//div[contains(@class,'make-booking-tab')]/div[5]/input");
	By oneWayCheckBox = By.xpath("//*[@id='oneWayTriptype']");

	By selectDate = By.xpath("");
	public void selectFrom(String fromPlace) {
		waitForElement(from);
		sendKeys(from, fromPlace);
		waitForElement(from).sendKeys(Keys.ENTER);
	}

	public void selectTo(String toPlace) {
		waitForElement(to);
		sendKeys(to, toPlace);
		waitForElement(to).sendKeys(Keys.ENTER);
	}

	public void selectDate() {
		waitForElement(date);
		click(date);
	}

	public void clickOneWayCheckBox() {
		waitForElement(oneWayCheckBox);
		click(oneWayCheckBox);
	}

	public void clickSubmitButton() {
		waitForElement(submitButton);
		click(submitButton);
	}

}
