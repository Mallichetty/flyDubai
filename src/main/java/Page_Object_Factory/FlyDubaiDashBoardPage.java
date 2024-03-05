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

	By from = By.xpath("//input[@id='airport-origin']");
	By to = By.xpath("//input[@id='airport-destination']");
	By date = By.xpath("//*[@class='lightpick__day is-available'][30]");
	By passengerDropDown = By
			.xpath("//*[@class='travellerDatadropdown bookingTo-wrapper drop-arrow-style']/div[1]/span[2]");
	By submitButton = By.xpath("//input[@type='submit']");
	By oneWayCheckBox = By.xpath("//*[@id='oneWayTriptype']");

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
		click(date);
	}

	public void clickOneWayCheckBox() {
		click(oneWayCheckBox);
	}

	public void clickSubmitButton() {
		click(submitButton);
	}

}
