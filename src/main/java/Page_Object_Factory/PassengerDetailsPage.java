package Page_Object_Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.Base;

public class PassengerDetailsPage extends Base {

    WebDriver driver;
    public PassengerDetailsPage(WebDriver driver)
    {
        this.driver=driver;
    }

    By verifyExtrasPageTitle = By.xpath("//*[text()='Passenger details']");
    By firstNameTxtBox = By.xpath("//*[@id='First_Name']");
    By lastNameTxtBox = By.xpath("//*[@id='Last_Name']");
    By emailAddressTxtBox = By.xpath("//*[@id='Email_Address']");

    By radioBtn= By.xpath("//input[@id='Male.Text-input']/preceding-sibling::div[3]");

    By countryCodeDropDwn = By.xpath("//*[@class='country-code-dropdown']");

    By countryCode = By.xpath("//*[text()='United Arab Emirates']");
    By mobileNoTxtBox = By.xpath("//*[@id='Mobile_Number']");

    By passportTxtBox = By.xpath("//*[@id='Passport_Number']");

    By issuingCountryDropDwn = By.xpath("//*[@id='Issuing_Country']");

    By countryDropDwnValue = By.xpath("//*[@id='countryValueCode']//*[text()='India']");
    
    By passPortIssueDay  = By.xpath("//div[@class='ng-star-inserted']/div[2]/following::div[9]");

    By passPortIssueMonth = By.xpath("//div[@class='ng-star-inserted']/div[2]/following::div[31]");

    By getPassPortIssueYear = By.xpath("//div[@class='ng-star-inserted']/div[2]/following::div[51]");

    By passPortExpiryDay = By.xpath("//div[@class='ng-star-inserted']/div[2]/following::div[65]");

    By passPortExpiryMonth = By.xpath("//div[@class='ng-star-inserted']/div[2]/following::div[81]");

    By passPortExpiryYear = By.xpath("//div[@class='ng-star-inserted']/div[2]/following::div[99]");

    By nationalityDropDwn = By.xpath("//div[@class='ng-star-inserted']/div[3]/following::div[7]");

    By dobDay = By.xpath("//div[@class='ng-star-inserted']/div[3]/following::div[35]");
    By dobMonth = By.xpath("//div[@class='ng-star-inserted']/div[3]/following::div52]");
    By dobYear = By.xpath("//div[@class='ng-star-inserted']/div[3]/following::div[65]");

    By reviewBookingBtn = By.xpath("//div[@class='ng-star-inserted']/div[3]/following::div[83]");
    public Boolean verifyPageTitle()
    {
        return waitForElement(verifyExtrasPageTitle).isDisplayed();
    }

    public void selectValue(String value)
    {
        String xpath = "//div[@role='listbox']/mat-option["+value+"]";
        By clickValue = By.xpath(xpath);
        waitForElement(clickValue).click();
    }

    public void enterfirstName(String fName)
    {
        waitForElement(firstNameTxtBox).sendKeys(fName);
    }
    public void enterlastName(String LName)
    {
        waitForElement(lastNameTxtBox).sendKeys(LName);
    }
    public void enterEmailAddress(String email)
    {
        waitForElement(emailAddressTxtBox).sendKeys(email);
    }

    public void selectGender()
    {
        waitForElement(radioBtn).click();
    }

    public void selectCountryCode()
    {
        waitForElement(countryCodeDropDwn).click();
        waitForElement(countryCode).click();
    }

    public void enterMobNo(String MobNum)
    {
        waitForElement(mobileNoTxtBox).sendKeys(MobNum);
    }

    public void enterPassportNo(String PassNo)
    {
        waitForElement(passportTxtBox).sendKeys(PassNo);
    }

    public void selectIssCountry()
    {
        waitForElement(issuingCountryDropDwn).click();
        waitForElement(countryDropDwnValue).click();
    }

    public void selectIssueDay()
    {
        waitForElement(passPortIssueDay).click();
        selectValue("01");
    }

    public void selectIssueMonth()
    {
        waitForElement(passPortIssueMonth).click();
        selectValue("03");
    }

    public void selectIssueYear()
    {
        waitForElement(getPassPortIssueYear).click();
        selectValue("2022");
    }

    public void selectExpiryDay()
    {
        waitForElement(passPortExpiryDay).click();
        selectValue("01");
    }

    public void selectExpiryMonth()
    {
        waitForElement(passPortExpiryMonth).click();
        selectValue("04");
    }
    public void selectExpiryYear()
    {
        waitForElement(passPortExpiryYear).click();
        selectValue("2025");
    }

    public void selectNationality()
    {
        waitForElement(nationalityDropDwn).click();
        waitForElement(countryDropDwnValue).click();
    }

    public void selectDOBDay()
    {
        waitForElement(dobDay).click();
        selectValue("01");
    }
    public void selectDOBMonth()
    {
        waitForElement(dobMonth).click();
        selectValue("01");
    }
    public void selectDOBYear()
    {
        waitForElement(dobYear).click();
        selectValue("2020");
    }
    public void clickReviewBooking()
    {
        waitForElement(reviewBookingBtn).click();
    }
}
