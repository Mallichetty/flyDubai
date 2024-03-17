package Page_Object_Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.Base;

public class ReviewYourBookingDetailsPage extends Base {
    WebDriver driver;
    public ReviewYourBookingDetailsPage(WebDriver driver)
    {
        this.driver=driver;
    }

    By verifyReviewPageTitle =By.xpath("//*[text()='Review your booking details']");

    public Boolean verifyPageTitle()
    {
        return waitForElement(verifyReviewPageTitle).isDisplayed();
    }
}
