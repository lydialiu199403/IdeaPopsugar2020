package popsugar.selenium.testCase;

import org.testng.annotations.Test;
import popsugar.selenium.base.DriverBase;
import popsugar.selenium.util.HandleCookie;
import popsugar.selenium.util.PropUtil;

import java.io.IOException;

public class testCookie extends CaseBase{
    public DriverBase driver;
    public HandleCookie handleCookie;
    public PropUtil pro;

    @Test
    public void test() throws IOException, InterruptedException {
        this.driver = InitialDriver("chrome");
        handleCookie = new HandleCookie(driver);

        pro = new PropUtil("src/test/resources/cookie.properties");
        driver.get("https://popsugar.dev10.onsugar.com");
        driver.maxWindow();
        //要获取secure站点的ss1
        handleCookie.setCookie();
        Thread.sleep(3000);
        driver.get("https://popsugar.dev10.onsugar.com/manage");


    }
}
