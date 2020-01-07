package popsugar.selenium.testCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
//import popsugar.selenium.base.DriverBase;
import popsugar.selenium.util.HandleCookie;
import popsugar.selenium.util.ProUtil;

import java.io.IOException;

public class testCookie extends CaseBase{
//    public DriverBase driver;
    public WebDriver driver;
    public HandleCookie handleCookie;
    public ProUtil pro;
    static Logger logger = Logger.getLogger(testCookie.class);

    @Test
    public void test() throws IOException, InterruptedException {
        PropertyConfigurator.configure("src/test/resources/log4j.properties");
        logger.debug("初始化浏览器");
        logger.debug("打开浏览器");
        driver = getDriver("chrome");
        handleCookie = new HandleCookie(driver);
        pro = new ProUtil("src/test/resources/cookie.properties");
        driver.get("https://popsugar.dev10.onsugar.com");
        driver.manage().window().maximize();
//        driver.maxWindow();
        //要获取secure站点的ss1
        handleCookie.setCookie();
        Thread.sleep(3000);
        driver.get("https://popsugar.dev10.onsugar.com/manage");
    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
