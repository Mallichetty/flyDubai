package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import resources.Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks extends Base
{

    @Before
    public void BeforeSteps()
    {
        driver.get(prop.getProperty("URL"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public void AfterSteps()
    {
        driver.quit();
    }
}
