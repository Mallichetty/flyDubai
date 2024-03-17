package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Page_Object_Factory.FlyDubaiDashBoardPage;

public class DashboardPage 
{

	WebDriver driver;
	public static Logger log = LogManager.getLogger(DashboardPage.class.getName());
	
	FlyDubaiDashBoardPage dashboardPage = new FlyDubaiDashBoardPage(driver);
	
	
	public void searchForFlight(String fromPlace, String toPlace)
	{
		dashboardPage.selectFrom(fromPlace);
		dashboardPage.selectTo(toPlace);
		dashboardPage.clickOneWayCheckBox();
		dashboardPage.selectDate();
	}

	public void clickSearchButton()
	{
		dashboardPage.clickSubmitButton();
	}
	
}
