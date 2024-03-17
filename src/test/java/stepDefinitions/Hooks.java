package stepDefinitions;

import resources.Base;

public class Hooks extends Base
{

    public void BeforeSteps()
    {
        driver.get(prop.getProperty("URL"));
    }
    public void AfterSteps()
    {
        driver.quit();
    }
}
