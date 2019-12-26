package popsugar.selenium.testCase;

import popsugar.selenium.base.DriverBase;

public class CaseBase {
    public DriverBase InitialDriver(String browser)
    {
        return new DriverBase(browser);
    }
}
