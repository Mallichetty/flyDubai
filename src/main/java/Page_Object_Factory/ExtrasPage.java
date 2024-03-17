package Page_Object_Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.Base;

public class ExtrasPage extends Base
{
    WebDriver driver;
    public ExtrasPage(WebDriver driver)
    {
        this.driver=driver;
    }

    By verifyExtrasPageTitle =By.xpath("//*[text()='Select extras']");
    By baggageSection = By.xpath("//label[@id='extras-bag_Label']");
    By passengerDetailBtn = By.xpath("//*[@class='passenger-details-btn']/following::a[1]/span[text()='Continue to passenger details']");



    public Boolean verifyPageTitle()
    {
        return waitForElement(verifyExtrasPageTitle).isDisplayed();
    }

    public void clickBaggageOption()
    {
        waitForElement(baggageSection).click();
    }
    public void clickPassengerDetailsBtn() {
        waitForElement(passengerDetailBtn);
        click(passengerDetailBtn);
    }
}
