package Page_Object_Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.Base;

public class ResultsPage extends Base {

    WebDriver driver;

    public ResultsPage(WebDriver driver)
    {
        this.driver =driver;
    }

    By pageTitle = By.xpath("//*[text()='SELECT DEPARTING FLIGHT']");
    By selectFlight = By.xpath("//*[@class='avail-list-desk']/div/div/div[1]");
    By selectFareType = By.xpath("//*[@class='expanded-flight-view']//*[@class='fareBrandBox']");

    By fareSelectButton =By.xpath("//*[@class='fare-wrapper']/following::button[1]");

    public Boolean verifyPageTitle()
    {
        return waitForElement(pageTitle).isDisplayed();
    }
    public void clickSelectFlight() {
        waitForElement(selectFlight);
        click(selectFlight);
    }

    public void clickSelectDate() {
        waitForElement(selectFareType);
        click(selectFareType);
    }
    public void clickSelectFareButton() {
        waitForElement(fareSelectButton);
        click(fareSelectButton);
    }


}
