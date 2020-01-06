package popsugar.selenium.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import popsugar.selenium.base.DriverBase;

public class CaseBase {
    /*public DriverBase InitialDriver(String browser)
    {
        return new DriverBase(browser);
    }*/
    public WebDriver driver;
    public WebDriver getDriver(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "E:\\Program Files\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }else{
            System.setProperty("webdriver.chrome.driver", "E:\\Program Files\\chromedriver\\chromedriver.exe");
            driver = new FirefoxDriver();
        }
        return driver;

    }
}
