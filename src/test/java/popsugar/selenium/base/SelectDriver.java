package popsugar.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
    public WebDriver selectDriver(String browser){
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.marionette", "E:\\\\dependency pac\\\\chromedriver.exe");
            return new ChromeDriver();
        }else{
            System.setProperty("webdriver.firefox.marionette","E:\\\\dependency pac\\\\chromedriver.exe");
            return new FirefoxDriver();
        }

    }
}
